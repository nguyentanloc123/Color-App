package com.tanloc2017.appmau;
import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import java.util.ArrayList;

public class Maintimmau extends AppCompatActivity {


   /* ListView listView;
    ListViewAdapter adapter;
//    String[] title;
//    String[] description;
//    int[] icon;
    ArrayList<Model> arrayList = new ArrayList<Model>();

   String[] title = new String[]{"MAROON", "BROWN", "SADDLE BROWN", "PERU", "DARK GOLDEN ROD",
            "CHOCOLATE", "GOLDEN ROD", "SANDY BROWN", "TAN", "WHEAT", "BISQUE", "BURLYWOOD",
            "ALICE BLUE", "AQUA", "AQUA MARINE", "BLUE", "CADET BLUE", "CORN FLOWER BLUE"
            , "DARK BLUE", "BLACK", "CORAL", "DARK CYAN", "DARK GRAY", "DARK GREEN", "DARK ORANGE",
            "DARK RED", "PALE VIOLETRED"
            , "DEEP PINK", "DEEP SKYBLUE", "DIM GRAY", "DODGER BLUE", "FIRE BRICK", "WHEAT",
            "FUCHSIA", "GAINSBORO", "GOLD", "GRAY", "GREEN", "HOT PINK", "INDIANRED", "INDIGO",
            "LIGHT PINK", "LAWN GREEN", "LIGHT SKY BLUE"
            , "LIGHT GRAY", "LIGHT SALMON", "LIGHT SEAGREEN", "LIGHT SLATE GRAY", "MEDIUM BLUE",
            "MEDIUM SLATE BLUE",
            "MEDIUM SPRING GREEN", "MID NIGHT BLUE", "NAVY", "OLIVE", "ORANGE", "PINK", "RED"
            , "ROSY BROWN", "ROYAL BLUE"
            , "SALMON", "SILVER", "SLATEGRAY", "STEEL BLUE", "TEAL", "TOMATO", "PURPLE",
            "MEDIUM VIOLETRED", "VIOLET"
            , "WHITE", "WHITE SMOKE", "SNOW", "MINT CREAM", "SEA SHELL", "OLD LACE", "LIME",
            "IVORY", "FLORAL WHITE"
            , "HONEYDEW", "ANTIQUE WHITE", "BEIGE", "NAVAJOWHITE", "CORNSILK", "MISTYROSE",
            "YELLOW"};
    String[] description = new String[]{"#800000", "#A52A2A", "#8B4513", "#CD853F", "#B8860B", "#D2691E",
            "#DAA520", "#F4A460", "#D2B48C"
            , "#F5DEB3", "#FFE4C4", "#DEB887", "#F0F8FF", "#00FFFF", "#7FFFD4", "#0000FF",
            "#5F9EA0", "#6495ED"
            , "#00008B", "#000000", "#FF7F50", "#008B8B", "#A9A9A9", "#006400", "#FF8C00",
            "#8B0000", "#DB7093",
            "#FF1493", "#00BFFF", "#696969", "#1E90FF", "#B22222", "#F5DEB3", "#FF00FF", "#DCDCDC", "#FFD700"
            , "#808080", "#008000", "#FF69B4", "#CD5C5C", "#4B0082", "#FFB6C1", "#7CFC00",
            "#87CEFA", "#D3D3D3",
            "#FFA07A", "#20B2AA", "#778899", "#0000CD", "#7B68EE", "#00FA9A", "#191970",
            "#000080", "#808000",
            "#FFA500", "#FFC0CB", "#FF0000", "#BC8F8F", "#4169E1", "#FA8072", "#C0C0C0",
            "#708090 ", "#4682B4"
            , "#008080", "#FF6347", "#800080", "#C71585", "#EE82EE", "#FFFFFF", "#F5F5F5",
            "#FFFAFA", "#F5FFFA",
            "#FFF5EE", "#FDF5E6", "#00FF00", "#FFFFF0", "#FFFAF0", "#F0FFF0", "#FAEBD7",
            "#F5F5DC", "#FFDEAD"
            , "#FFF8DC", "#FFE4E1", "#FFFF00"};
    int icon[] = new int[]{R.drawable.b_maroon, R.drawable.b1_brown, R.drawable.b3_saddlessbrower, R.drawable.b4_peru,
            R.drawable.b5_darkgoldenrod, R.drawable.b6_chocolate, R.drawable.b7goldenrod, R.drawable.b8_sandybrowse,
            R.drawable.b9_tan, R.drawable.b10_bwheat, R.drawable.b11_bisque, R.drawable.b12_burlywood,
            R.drawable.bl_aliceblue, R.drawable.bl2_aqua, R.drawable.bl3aquamarine,
            R.drawable.bl4_blue, R.drawable.bl5_cadetblue, R.drawable.bl6_cornflowerblue, R.drawable.bl7_darkblue,
            R.drawable.black, R.drawable.coral, R.drawable.darkcyan, R.drawable.darkgray, R.drawable.darkgreen,
            R.drawable.darkorage, R.drawable.darkred, R.drawable.paleviolet, R.drawable.deeppink, R.drawable.deepskyblue,
            R.drawable.dimgray, R.drawable.dogerblue, R.drawable.firebrick, R.drawable.b10_bwheat, R.drawable.fushia,
            R.drawable.gainborp, R.drawable.gold, R.drawable.gray, R.drawable.green, R.drawable.hotpink,
            R.drawable.indianred, R.drawable.indigo, R.drawable.kightpink, R.drawable.lawngreen,
            R.drawable.light, R.drawable.lightgray, R.drawable.lightsalmon, R.drawable.lightseagreen,
            R.drawable.lightslategray, R.drawable.mediumblue, R.drawable.mediumsblue, R.drawable.mediumspring,
            R.drawable.midnightblue, R.drawable.navy, R.drawable.olive, R.drawable.orange, R.drawable.pink,
            R.drawable.red, R.drawable.rosybrown, R.drawable.royalblue, R.drawable.salmon, R.drawable.silver,
            R.drawable.slategray, R.drawable.steelblue, R.drawable.teal, R.drawable.tomato, R.drawable.v1_purple,
            R.drawable.v3_mediumviolet, R.drawable.violet, R.drawable.w_white, R.drawable.w2_whitesmoke,
            R.drawable.w3_snow, R.drawable.w4_mindcream, R.drawable.w5_seashell, R.drawable.w6_oldplace,
            R.drawable.w7_linen, R.drawable.w8_ivory, R.drawable.w9_florawwhite, R.drawable.w10_honeydew,
            R.drawable.w12_antiquewhite, R.drawable.w13_beige, R.drawable.w14_najawwhite, R.drawable.w15_cornsilk,
            R.drawable.w15_myrose, R.drawable.yellow};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maintimmau);



        //this is demo update to java file

            ActionBar actionBar = getSupportActionBar();
            actionBar.setTitle("Items List");



            listView = findViewById(R.id.listView);

        listView = findViewById(R.id.listView);

        for (int i =0; i<title.length; i++){
            Model model = new Model(title[i], description[i], icon[i]);
            //bind all strings in an array
            arrayList.add(model);
        }

        //pass results to listViewAdapter class
        adapter = new ListViewAdapter(this, arrayList);

        //bind the adapter to the listview
        listView.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);

        MenuItem myActionMenuItem = menu.findItem(R.id.action_search);
        android.support.v7.widget.SearchView searchView = (SearchView)myActionMenuItem.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                if (TextUtils.isEmpty(s)){
                    adapter.filter("");
                    listView.clearTextFilter();
                }
                else {
                    adapter.filter(s);
                }
                return true;
            }
        });
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id==R.id.action_settings){
            //do your functionality here
            return true;
        }
        return super.onOptionsItemSelected(item);
    }*/
   String s1;
   ListView listView;
    ListViewAdapter adapter;
    String[] title;
    String[] description;
    int[] icon;
    SearchView searchView;
    ArrayList<Model> arrayList = new ArrayList<>();

    //this is demo update to java file

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maintimmau);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Color List");

        title = new String[]{"MAROON", "BROWN", "SADDLE BROWN", "PERU", "DARK GOLDEN ROD",
                "CHOCOLATE", "GOLDEN ROD", "SANDY BROWN", "TAN", "WHEAT", "BISQUE", "BURLYWOOD",
                "ALICE BLUE", "AQUA", "AQUA MARINE", "BLUE", "CADET BLUE", "CORN FLOWER BLUE"
                , "DARK BLUE", "BLACK", "CORAL", "DARK CYAN", "DARK GRAY", "DARK GREEN", "DARK ORANGE",
                "DARK RED", "PALE VIOLETRED"
                , "DEEP PINK", "DEEP SKYBLUE", "DIM GRAY", "DODGER BLUE", "FIRE BRICK", "WHEAT",
                "FUCHSIA", "GAINSBORO", "GOLD", "GRAY", "GREEN", "HOT PINK", "INDIANRED", "INDIGO",
                "LIGHT PINK", "LAWN GREEN", "LIGHT SKY BLUE"
                , "LIGHT GRAY", "LIGHT SALMON", "LIGHT SEA GREEN", "LIGHT SLATE GRAY", "MEDIUM BLUE",
                "MEDIUM SLATE BLUE",
                "MEDIUM SPRING GREEN", "MID NIGHT BLUE", "NAVY", "OLIVE", "ORANGE", "PINK", "RED"
                , "ROSY BROWN", "ROYAL BLUE"
                , "SALMON", "SILVER", "SLATE GRAY", "STEEL BLUE", "TEAL", "TOMATO", "PURPLE",
                "MEDIUM VIOLET RED", "VIOLET"
                , "WHITE", "WHITE SMOKE", "SNOW", "MINT CREAM", "SEA SHELL", "OLD LACE", "LIME",
                "IVORY", "FLORAL WHITE"
                , "HONEYDEW", "ANTIQUE WHITE", "BEIGE", "NAVAJOWHITE", "CORN SILK", "MISTY ROSE",
                "YELLOW"};
        description = new String[]{"#800000", "#A52A2A", "#8B4513", "#CD853F", "#B8860B", "#D2691E",
                "#DAA520", "#F4A460", "#D2B48C"
                , "#F5DEB3", "#FFE4C4", "#DEB887", "#F0F8FF", "#00FFFF", "#7FFFD4", "#0000FF",
                "#5F9EA0", "#6495ED"
                , "#00008B", "#000000", "#FF7F50", "#008B8B", "#A9A9A9", "#006400", "#FF8C00",
                "#8B0000", "#DB7093",
                "#FF1493", "#00BFFF", "#696969", "#1E90FF", "#B22222", "#F5DEB3", "#FF00FF", "#DCDCDC", "#FFD700"
                , "#808080", "#008000", "#FF69B4", "#CD5C5C", "#4B0082", "#FFB6C1", "#7CFC00",
                "#87CEFA", "#D3D3D3",
                "#FFA07A", "#20B2AA", "#778899", "#0000CD", "#7B68EE", "#00FA9A", "#191970",
                "#000080", "#808000",
                "#FFA500", "#FFC0CB", "#FF0000", "#BC8F8F", "#4169E1", "#FA8072", "#C0C0C0",
                "#708090 ", "#4682B4"
                , "#008080", "#FF6347", "#800080", "#C71585", "#EE82EE", "#FFFFFF", "#F5F5F5",
                "#FFFAFA", "#F5FFFA",
                "#FFF5EE", "#FDF5E6", "#00FF00", "#FFFFF0", "#FFFAF0", "#F0FFF0", "#FAEBD7",
                "#F5F5DC", "#FFDEAD"
                , "#FFF8DC", "#FFE4E1", "#FFFF00"};
        icon = new int[]{R.drawable.b_maroon, R.drawable.b1_brown, R.drawable.b3_saddlessbrower, R.drawable.b4_peru,
                R.drawable.b5_darkgoldenrod, R.drawable.b6_chocolate, R.drawable.b7goldenrod, R.drawable.b8_sandybrowse,
                R.drawable.b9_tan, R.drawable.b10_bwheat, R.drawable.b11_bisque, R.drawable.b12_burlywood,
                R.drawable.bl_aliceblue, R.drawable.bl2_aqua, R.drawable.bl3aquamarine,
                R.drawable.bl4_blue, R.drawable.bl5_cadetblue, R.drawable.bl6_cornflowerblue, R.drawable.bl7_darkblue,
                R.drawable.black, R.drawable.coral, R.drawable.darkcyan, R.drawable.darkgray, R.drawable.darkgreen,
                R.drawable.darkorage, R.drawable.darkred, R.drawable.paleviolet, R.drawable.deeppink, R.drawable.deepskyblue,
                R.drawable.dimgray, R.drawable.dogerblue, R.drawable.firebrick, R.drawable.b10_bwheat, R.drawable.fushia,
                R.drawable.gainborp, R.drawable.gold, R.drawable.gray, R.drawable.green, R.drawable.hotpink,
                R.drawable.indianred, R.drawable.indigo, R.drawable.kightpink, R.drawable.lawngreen,
                R.drawable.light, R.drawable.lightgray, R.drawable.lightsalmon, R.drawable.lightseagreen,
                R.drawable.lightslategray, R.drawable.mediumblue, R.drawable.mediumsblue, R.drawable.mediumspring,
                R.drawable.midnightblue, R.drawable.navy, R.drawable.olive, R.drawable.orange, R.drawable.pink,
                R.drawable.red, R.drawable.rosybrown, R.drawable.royalblue, R.drawable.salmon, R.drawable.silver,
                R.drawable.slategray, R.drawable.steelblue, R.drawable.teal, R.drawable.tomato, R.drawable.v1_purple,
                R.drawable.v3_mediumviolet, R.drawable.violet, R.drawable.w_white, R.drawable.w2_whitesmoke,
                R.drawable.w3_snow, R.drawable.w4_mindcream, R.drawable.w5_seashell, R.drawable.w6_oldplace,
                R.drawable.w7_linen, R.drawable.w8_ivory, R.drawable.w9_florawwhite, R.drawable.w10_honeydew,
                R.drawable.w12_antiquewhite, R.drawable.w13_beige, R.drawable.w14_najawwhite, R.drawable.w15_cornsilk,
                R.drawable.w15_myrose, R.drawable.yellow};

        listView = findViewById(R.id.listView);

        for (int i =0; i<title.length; i++){
            Model model = new Model(title[i], description[i], icon[i]);
            //bind all strings in an array
            arrayList.add(model);
        }

        //pass results to listViewAdapter class
        adapter = new ListViewAdapter(this, arrayList);



        //bind the adapter to the listview
        listView.setAdapter(adapter);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);

        MenuItem myActionMenuItem = menu.findItem(R.id.action_search);
       // MenuItem myitem=menu.findItem(R.id.search_voice_btn);
        SearchView searchView = (SearchView)myActionMenuItem.getActionView();
       // SearchView searchView1=(SearchView)myitem.getActionView();
      //  SearchManager searchManager =(SearchManager)getSystemService(Context.SEARCH_SERVICE);
     //   searchView1.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                if (TextUtils.isEmpty(s)){
                    adapter.filter("");
                    listView.clearTextFilter();
                }
                else {
                    adapter.filter(s);
                }
                return true;
            }
        });
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id==R.id.action_settings){
            //do your functionality here
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


}
