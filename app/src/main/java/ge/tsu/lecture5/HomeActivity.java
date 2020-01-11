package ge.tsu.lecture5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import ge.tsu.lecture5.fragments.GPAFragment;

public class HomeActivity extends AppCompatActivity {

  private GPAFragment mGpaFragment;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_home);
    mGpaFragment = (GPAFragment) getSupportFragmentManager().findFragmentById(R.id.gpa_fragment);
    mGpaFragment.setCallback(new GPAFragment.Callback() {
      @Override
      public void onGPaChanged(float gpa) {
        Toast.makeText(HomeActivity.this, String.format("GPA Changed to %f", gpa), Toast.LENGTH_SHORT).show();
      }
    });
  }

  public void setGPA(View view) {
    mGpaFragment.setGPA(500);
  }

  public void chooseSubject(View view) {
    Intent intent = new Intent(this, ChooseSubjectActivity.class);
    startActivity(intent);
  }

  public void goToCal(View view){
    Intent intent=new Intent(this,CalendarActvity.class);
    startActivity(intent);
  }
}
