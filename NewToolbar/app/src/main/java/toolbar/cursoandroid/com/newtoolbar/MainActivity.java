package toolbar.cursoandroid.com.newtoolbar;

import android.net.sip.SipAudioCall;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

        private Toolbar myToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        myToolbar.setTitle("Filmes");
        setSupportActionBar(myToolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        SearchView sv = new SearchView(this);
        sv.setOnQueryTextListener(new SearchFiltro());
        MenuItem m1 = menu.add(0,0,0,"Item 1");
        m1.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
        m1.setActionView(sv);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_principal,menu);


        return true;
    }
    private class SearchFiltro implements SearchView.OnQueryTextListener{

        @Override
        public boolean onQueryTextChange(String newText) {

            Log.i("Script","onQueryTextChange->"+ newText);

            return false;
        }

        @Override
        public boolean onQueryTextSubmit(String query) {
            Log.i("Script","onQueryTextSubmit->"+ query);
            return false;
        }
    }

   // @Override
   // public boolean onOptionsItemSelected(MenuItem item) {

      // switch(item.getItemId())
        {
         // case R.id.action_biblioteca:
              //abrir nova view

              //  default:
                    //return super.onOptionsItemSelected(item);
      //  }

    }
}
