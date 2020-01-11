package ge.tsu.lecture5;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import ge.tsu.lecture5.fragments.CreditCounterFragment;
import ge.tsu.lecture5.fragments.GPAFragment;

public class ChooseSubjectActivity extends AppCompatActivity {

  private GPAFragment mGpaFragment;
  private CreditCounterFragment mCreditCounterFragment;

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_choose_subject);
    mGpaFragment = new GPAFragment();
    mCreditCounterFragment = new CreditCounterFragment();
    setFragment(mGpaFragment);
  }

  public void showCredits(View view) {
    setFragment(mCreditCounterFragment);
  }

  public void setFragment(Fragment fragment) {
    FragmentManager fragmentManager = getSupportFragmentManager();
    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
    fragmentTransaction.replace(R.id.gpa_fragment_2, fragment);
    fragmentTransaction.commit();
  }
}
