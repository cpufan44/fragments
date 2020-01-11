package ge.tsu.lecture5;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import ge.tsu.lecture5.fragments.CreditCounterFragment;

public class CalendarActvity extends AppCompatActivity {

  private CreditCounterFragment mCreditCounterFregent;

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_calendar);
    mCreditCounterFregent = new CreditCounterFragment();
    setFragment(mCreditCounterFregent);
  }


  public void changeCredits(View view){
    mCreditCounterFregent.setCredit(245);
  }

  public void setFragment(Fragment fragment) {
    FragmentManager fragmentManager = getSupportFragmentManager();
    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
    fragmentTransaction.replace(R.id.creditsForCal, fragment);
    fragmentTransaction.commit();
  }
}
