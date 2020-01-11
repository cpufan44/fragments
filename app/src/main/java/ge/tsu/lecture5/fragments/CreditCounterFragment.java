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

public class CreditCounterFragment extends Fragment {
  private TextView mCredits;

  @Nullable
  @Override
  public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
    View view= inflater.inflate(R.layout.fragment_credit_counter, container, false);
    mCredits=view.findViewById(R.id.creditCount);
    return view;
  }

  public void setCredit(int credit){
    mCredits.setText(String.format("Your credits are: %d",credit));
  }
}
