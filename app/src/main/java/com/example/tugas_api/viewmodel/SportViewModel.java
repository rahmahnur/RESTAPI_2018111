package com.example.tugas_api.viewmodel;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.example.tugas_api.api.ApiClient;
import com.example.tugas_api.model.SportList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SportViewModel {
  private static final String TAG = "SportViewModel";
  MutableLiveData<SportList> sport;

  public MutableLiveData<SportList> getSport() {
    if (sport == null) {
      sport = new MutableLiveData<>();
      setSport();
    }
    return sport;
  }

  private void setSport() {
    ApiClient.getInstance().getApi().getSportList("England")
            .enqueue(new Callback<SportList>() {
              @Override
              public void onResponse(Call<SportList> call, Response<SportList> response) {
                if (response.isSuccessful()) {
                  sport.postValue(response.body());
                }
              }

              @Override
              public void onFailure(Call<SportList> call, Throwable t) {
                Log.d(TAG, "onFailure: " + t.getMessage());
              }
            });
  }
}
