package ge.tsu.lecture5.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import ge.tsu.lecture5.R;

public class GPAFragment extends Fragment {

  private View mView;
  private Callback mCallback;

  @Nullable
  @Override
  public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
    mView = inflater.inflate(R.layout.fragment_gpa, container, false);

    mView.findViewById(R.id.setGpaTo3).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        if (mCallback != null) {
          mCallback.onGPaChanged(3);
          setGPA(3);
        }
      }
    });
    return mView;
  }

  public void setGPA(float gpa) {
    ((TextView) mView.findViewById(R.id.gpa)).setText(gpa + "");
  }

  public void setCallback(Callback mCallback) {
    this.mCallback = mCallback;
  }

  public interface Callback {
    void onGPaChanged(float gpa);
  }
}
