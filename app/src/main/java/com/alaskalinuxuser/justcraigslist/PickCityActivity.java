/*  Copyright 2017 by AlaskaLinuxUser (https://thealaskalinuxuser.wordpress.com)
*
*   Licensed under the Apache License, Version 2.0 (the "License");
*   you may not use this file except in compliance with the License.
*   You may obtain a copy of the License at
*
*       http://www.apache.org/licenses/LICENSE-2.0
*
*   Unless required by applicable law or agreed to in writing, software
*   distributed under the License is distributed on an "AS IS" BASIS,
*   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
*   See the License for the specific language governing permissions and
*   limitations under the License.
*/
package com.alaskalinuxuser.justcraigslist;

import android.app.Activity;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import static com.alaskalinuxuser.justcraigslist.MainActivity.colorChoice;
import static com.alaskalinuxuser.justcraigslist.MainActivity.fabColorChoice;
import static com.alaskalinuxuser.justcraigslist.MainActivity.textColorChoice;
import static com.alaskalinuxuser.justcraigslist.MainActivity.backChoice;

public class PickCityActivity extends AppCompatActivity {

    // Declare my variables.
    ListView theList;
    ArrayList<String> cityList, urlList;
    ArrayAdapter<String> addaptedAray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_city);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        LinearLayout llPicCity = (LinearLayout) findViewById(R.id.LLpickcity);

        // Set the Background color.
        switch (backChoice) {

            case 0:

                if(Build.VERSION.SDK_INT > 16) {

                    llPicCity.setBackground(getResources().getDrawable(R.drawable.jindong));

                } else {

                    llPicCity.setBackgroundDrawable(getResources().getDrawable(R.drawable.jindong));

                }

                break;

            case 1:

                if(Build.VERSION.SDK_INT > 16) {

                    llPicCity.setBackground(getResources().getDrawable(R.drawable.plymouth));

                } else {

                    llPicCity.setBackgroundDrawable(getResources().getDrawable(R.drawable.plymouth));

                }

                break;

            case 2:

                if(Build.VERSION.SDK_INT > 16) {

                    llPicCity.setBackground(getResources().getDrawable(R.drawable.chair));

                } else {

                    llPicCity.setBackgroundDrawable(getResources().getDrawable(R.drawable.chair));

                }

                break;

            case 3:

                if(Build.VERSION.SDK_INT > 16) {

                    llPicCity.setBackground(getResources().getDrawable(R.drawable.collie));

                } else {

                    llPicCity.setBackgroundDrawable(getResources().getDrawable(R.drawable.collie));

                }

                break;

            case 4:

                if(Build.VERSION.SDK_INT > 16) {

                    llPicCity.setBackground(getResources().getDrawable(R.drawable.flower));

                } else {

                    llPicCity.setBackgroundDrawable(getResources().getDrawable(R.drawable.flower));

                }

                break;

            case 5:

                llPicCity.setBackgroundColor(Color.GRAY);

                break;

            case 6:

                llPicCity.setBackgroundColor(Color.BLACK);

                break;

            case 7:

                llPicCity.setBackgroundColor(Color.WHITE);

                break;

        }

        // Set the title bar color.
        switch (colorChoice) {

            case 0:
                toolbar.setBackgroundColor(Color.BLUE);
                break;

            case 1:
                toolbar.setBackgroundColor(Color.RED);
                break;

            case 2:
                toolbar.setBackgroundColor(Color.GREEN);
                break;

            case 3:
                toolbar.setBackgroundColor(Color.GRAY);
                break;

            case 4:
                toolbar.setBackgroundColor(Color.BLACK);
                break;

            case 5:
                toolbar.setBackgroundColor(Color.WHITE);
                break;

            case 6:
                toolbar.setBackgroundColor(Color.MAGENTA);
                break;

            case 7:
                toolbar.setBackgroundColor(Color.CYAN);
                break;

        }

        // Defining the list view that I want by id.
        theList = (ListView) findViewById(R.id.theList);

        // Defining an array of titles and urls.
        cityList = new ArrayList<String>();
        urlList = new ArrayList<String>();

        // Clear the lists, so we don't get duplicates.
        cityList.clear();
        urlList.clear();

        // And add the cities and urls.
        urlList.add("https://auburn.craigslist.org/"); cityList.add("auburn, Alabama");
        urlList.add("https://bham.craigslist.org/"); cityList.add("birmingham, Alabama");
        urlList.add("https://dothan.craigslist.org/"); cityList.add("dothan, Alabama");
        urlList.add("https://shoals.craigslist.org/"); cityList.add("florence / muscle shoals, Alabama");
        urlList.add("https://gadsden.craigslist.org/"); cityList.add("gadsden-anniston, Alabama");
        urlList.add("https://huntsville.craigslist.org/"); cityList.add("huntsville / decatur, Alabama");
        urlList.add("https://mobile.craigslist.org/"); cityList.add("mobile, Alabama");
        urlList.add("https://montgomery.craigslist.org/"); cityList.add("montgomery, Alabama");
        urlList.add("https://tuscaloosa.craigslist.org/"); cityList.add("tuscaloosa, Alabama");
        urlList.add("https://anchorage.craigslist.org/"); cityList.add("anchorage / mat-su, Alaska");
        urlList.add("https://fairbanks.craigslist.org/"); cityList.add("fairbanks, Alaska");
        urlList.add("https://kenai.craigslist.org/"); cityList.add("kenai peninsula, Alaska");
        urlList.add("https://juneau.craigslist.org/"); cityList.add("southeast alaska, Alaska");
        urlList.add("https://flagstaff.craigslist.org/"); cityList.add("flagstaff / sedona, Arizona");
        urlList.add("https://mohave.craigslist.org/"); cityList.add("mohave county, Arizona");
        urlList.add("https://phoenix.craigslist.org/"); cityList.add("phoenix, Arizona");
        urlList.add("https://prescott.craigslist.org/"); cityList.add("prescott, Arizona");
        urlList.add("https://showlow.craigslist.org/"); cityList.add("show low, Arizona");
        urlList.add("https://sierravista.craigslist.org/"); cityList.add("sierra vista, Arizona");
        urlList.add("https://tucson.craigslist.org/"); cityList.add("tucson, Arizona");
        urlList.add("https://yuma.craigslist.org/"); cityList.add("yuma, Arizona");
        urlList.add("https://fayar.craigslist.org/"); cityList.add("fayetteville, Arkansas");
        urlList.add("https://fortsmith.craigslist.org/"); cityList.add("fort smith, Arkansas");
        urlList.add("https://jonesboro.craigslist.org/"); cityList.add("jonesboro, Arkansas");
        urlList.add("https://littlerock.craigslist.org/"); cityList.add("little rock, Arkansas");
        urlList.add("https://texarkana.craigslist.org/"); cityList.add("texarkana, Arkansas");
        urlList.add("https://bakersfield.craigslist.org/"); cityList.add("bakersfield, California");
        urlList.add("https://chico.craigslist.org/"); cityList.add("chico, California");
        urlList.add("https://fresno.craigslist.org/"); cityList.add("fresno / madera, California");
        urlList.add("https://goldcountry.craigslist.org/"); cityList.add("gold country, California");
        urlList.add("https://hanford.craigslist.org/"); cityList.add("hanford-corcoran, California");
        urlList.add("https://humboldt.craigslist.org/"); cityList.add("humboldt county, California");
        urlList.add("https://imperial.craigslist.org/"); cityList.add("imperial county, California");
        urlList.add("https://inlandempire.craigslist.org/"); cityList.add("inland empire, California");
        urlList.add("https://losangeles.craigslist.org/"); cityList.add("los angeles, California");
        urlList.add("https://mendocino.craigslist.org/"); cityList.add("mendocino county, California");
        urlList.add("https://merced.craigslist.org/"); cityList.add("merced, California");
        urlList.add("https://modesto.craigslist.org/"); cityList.add("modesto, California");
        urlList.add("https://monterey.craigslist.org/"); cityList.add("monterey bay, California");
        urlList.add("https://orangecounty.craigslist.org/"); cityList.add("orange county, California");
        urlList.add("https://palmsprings.craigslist.org/"); cityList.add("palm springs, California");
        urlList.add("https://redding.craigslist.org/"); cityList.add("redding, California");
        urlList.add("https://sacramento.craigslist.org/"); cityList.add("sacramento, California");
        urlList.add("https://sandiego.craigslist.org/"); cityList.add("san diego, California");
        urlList.add("https://sfbay.craigslist.org/"); cityList.add("san francisco bay area, California");
        urlList.add("https://slo.craigslist.org/"); cityList.add("san luis obispo, California");
        urlList.add("https://santabarbara.craigslist.org/"); cityList.add("santa barbara, California");
        urlList.add("https://santamaria.craigslist.org/"); cityList.add("santa maria, California");
        urlList.add("https://siskiyou.craigslist.org/"); cityList.add("siskiyou county, California");
        urlList.add("https://stockton.craigslist.org/"); cityList.add("stockton, California");
        urlList.add("https://susanville.craigslist.org/"); cityList.add("susanville, California");
        urlList.add("https://ventura.craigslist.org/"); cityList.add("ventura county, California");
        urlList.add("https://visalia.craigslist.org/"); cityList.add("visalia-tulare, California");
        urlList.add("https://yubasutter.craigslist.org/"); cityList.add("yuba-sutter, California");
        urlList.add("https://boulder.craigslist.org/"); cityList.add("boulder, Colorado");
        urlList.add("https://cosprings.craigslist.org/"); cityList.add("colorado springs, Colorado");
        urlList.add("https://denver.craigslist.org/"); cityList.add("denver, Colorado");
        urlList.add("https://eastco.craigslist.org/"); cityList.add("eastern CO, Colorado");
        urlList.add("https://fortcollins.craigslist.org/"); cityList.add("fort collins / north CO, Colorado");
        urlList.add("https://rockies.craigslist.org/"); cityList.add("high rockies, Colorado");
        urlList.add("https://pueblo.craigslist.org/"); cityList.add("pueblo, Colorado");
        urlList.add("https://westslope.craigslist.org/"); cityList.add("western slope, Colorado");
        urlList.add("https://newlondon.craigslist.org/"); cityList.add("eastern CT, Connecticut");
        urlList.add("https://hartford.craigslist.org/"); cityList.add("hartford, Connecticut");
        urlList.add("https://newhaven.craigslist.org/"); cityList.add("new haven, Connecticut");
        urlList.add("https://nwct.craigslist.org/"); cityList.add("northwest CT, Connecticut");
        urlList.add("https://delaware.craigslist.org/"); cityList.add("delaware, Delaware");
        urlList.add("https://washingtondc.craigslist.org/"); cityList.add("washington, District of Columbia");
        urlList.add("http://miami.craigslist.org/brw/"); cityList.add("broward county, Florida");
        urlList.add("https://daytona.craigslist.org/"); cityList.add("daytona beach, Florida");
        urlList.add("https://keys.craigslist.org/"); cityList.add("florida keys, Florida");
        urlList.add("https://fortlauderdale.craigslist.org/"); cityList.add("fort lauderdale, Florida");
        urlList.add("https://fortmyers.craigslist.org/"); cityList.add("ft myers / SW florida, Florida");
        urlList.add("https://gainesville.craigslist.org/"); cityList.add("gainesville, Florida");
        urlList.add("https://cfl.craigslist.org/"); cityList.add("heartland florida, Florida");
        urlList.add("https://jacksonville.craigslist.org/"); cityList.add("jacksonville, Florida");
        urlList.add("https://lakeland.craigslist.org/"); cityList.add("lakeland, Florida");
        urlList.add("http://miami.craigslist.org/mdc/"); cityList.add("miami / dade, Florida");
        urlList.add("https://lakecity.craigslist.org/"); cityList.add("north central FL, Florida");
        urlList.add("https://ocala.craigslist.org/"); cityList.add("ocala, Florida");
        urlList.add("https://okaloosa.craigslist.org/"); cityList.add("okaloosa / walton, Florida");
        urlList.add("https://orlando.craigslist.org/"); cityList.add("orlando, Florida");
        urlList.add("https://panamacity.craigslist.org/"); cityList.add("panama city, Florida");
        urlList.add("https://pensacola.craigslist.org/"); cityList.add("pensacola, Florida");
        urlList.add("https://sarasota.craigslist.org/"); cityList.add("sarasota-bradenton, Florida");
        urlList.add("https://miami.craigslist.org/"); cityList.add("south florida, Florida");
        urlList.add("https://spacecoast.craigslist.org/"); cityList.add("space coast, Florida");
        urlList.add("https://staugustine.craigslist.org/"); cityList.add("st augustine, Florida");
        urlList.add("https://tallahassee.craigslist.org/"); cityList.add("tallahassee, Florida");
        urlList.add("https://tampa.craigslist.org/"); cityList.add("tampa bay area, Florida");
        urlList.add("https://treasure.craigslist.org/"); cityList.add("treasure coast, Florida");
        urlList.add("http://miami.craigslist.org/pbc/"); cityList.add("palm beach county, Florida");
        urlList.add("https://albanyga.craigslist.org/"); cityList.add("albany, Georgia");
        urlList.add("https://athensga.craigslist.org/"); cityList.add("athens, Georgia");
        urlList.add("https://atlanta.craigslist.org/"); cityList.add("atlanta, Georgia");
        urlList.add("https://augusta.craigslist.org/"); cityList.add("augusta, Georgia");
        urlList.add("https://brunswick.craigslist.org/"); cityList.add("brunswick, Georgia");
        urlList.add("https://columbusga.craigslist.org/"); cityList.add("columbus, Georgia");
        urlList.add("https://macon.craigslist.org/"); cityList.add("macon / warner robins, Georgia");
        urlList.add("https://nwga.craigslist.org/"); cityList.add("northwest GA, Georgia");
        urlList.add("https://savannah.craigslist.org/"); cityList.add("savannah / hinesville, Georgia");
        urlList.add("https://statesboro.craigslist.org/"); cityList.add("statesboro, Georgia");
        urlList.add("https://valdosta.craigslist.org/"); cityList.add("valdosta, Georgia");
        urlList.add("https://honolulu.craigslist.org/"); cityList.add("hawaii, Hawaii");
        urlList.add("https://boise.craigslist.org/"); cityList.add("boise, Idaho");
        urlList.add("https://eastidaho.craigslist.org/"); cityList.add("east idaho, Idaho");
        urlList.add("https://lewiston.craigslist.org/"); cityList.add("lewiston / clarkston, Idaho");
        urlList.add("https://twinfalls.craigslist.org/"); cityList.add("twin falls, Idaho");
        urlList.add("https://bn.craigslist.org/"); cityList.add("bloomington-normal, Illinois");
        urlList.add("https://chambana.craigslist.org/"); cityList.add("champaign urbana, Illinois");
        urlList.add("https://chicago.craigslist.org/"); cityList.add("chicago, Illinois");
        urlList.add("https://decatur.craigslist.org/"); cityList.add("decatur, Illinois");
        urlList.add("https://lasalle.craigslist.org/"); cityList.add("la salle co, Illinois");
        urlList.add("https://mattoon.craigslist.org/"); cityList.add("mattoon-charleston, Illinois");
        urlList.add("https://peoria.craigslist.org/"); cityList.add("peoria, Illinois");
        urlList.add("https://rockford.craigslist.org/"); cityList.add("rockford, Illinois");
        urlList.add("https://carbondale.craigslist.org/"); cityList.add("southern illinois, Illinois");
        urlList.add("https://springfieldil.craigslist.org/"); cityList.add("springfield, Illinois");
        urlList.add("https://quincy.craigslist.org/"); cityList.add("western IL, Illinois");
        urlList.add("https://bloomington.craigslist.org/"); cityList.add("bloomington, Indiana");
        urlList.add("https://evansville.craigslist.org/"); cityList.add("evansville, Indiana");
        urlList.add("https://fortwayne.craigslist.org/"); cityList.add("fort wayne, Indiana");
        urlList.add("https://indianapolis.craigslist.org/"); cityList.add("indianapolis, Indiana");
        urlList.add("https://kokomo.craigslist.org/"); cityList.add("kokomo, Indiana");
        urlList.add("https://tippecanoe.craigslist.org/"); cityList.add("lafayette / west lafayette, Indiana");
        urlList.add("https://muncie.craigslist.org/"); cityList.add("muncie / anderson, Indiana");
        urlList.add("https://richmondin.craigslist.org/"); cityList.add("richmond , Indiana");
        urlList.add("https://southbend.craigslist.org/"); cityList.add("south bend / michiana, Indiana");
        urlList.add("https://terrehaute.craigslist.org/"); cityList.add("terre haute, Indiana");
        urlList.add("https://ames.craigslist.org/"); cityList.add("ames, Iowa");
        urlList.add("https://cedarrapids.craigslist.org/"); cityList.add("cedar rapids, Iowa");
        urlList.add("https://desmoines.craigslist.org/"); cityList.add("des moines, Iowa");
        urlList.add("https://dubuque.craigslist.org/"); cityList.add("dubuque, Iowa");
        urlList.add("https://fortdodge.craigslist.org/"); cityList.add("fort dodge, Iowa");
        urlList.add("https://iowacity.craigslist.org/"); cityList.add("iowa city, Iowa");
        urlList.add("https://masoncity.craigslist.org/"); cityList.add("mason city, Iowa");
        urlList.add("https://quadcities.craigslist.org/"); cityList.add("quad cities, Iowa");
        urlList.add("https://siouxcity.craigslist.org/"); cityList.add("sioux city, Iowa");
        urlList.add("https://ottumwa.craigslist.org/"); cityList.add("southeast IA, Iowa");
        urlList.add("https://waterloo.craigslist.org/"); cityList.add("waterloo / cedar falls, Iowa");
        urlList.add("https://lawrence.craigslist.org/"); cityList.add("lawrence, Kansas");
        urlList.add("https://ksu.craigslist.org/"); cityList.add("manhattan, Kansas");
        urlList.add("https://nwks.craigslist.org/"); cityList.add("northwest KS, Kansas");
        urlList.add("https://salina.craigslist.org/"); cityList.add("salina, Kansas");
        urlList.add("https://seks.craigslist.org/"); cityList.add("southeast KS, Kansas");
        urlList.add("https://swks.craigslist.org/"); cityList.add("southwest KS, Kansas");
        urlList.add("https://topeka.craigslist.org/"); cityList.add("topeka, Kansas");
        urlList.add("https://wichita.craigslist.org/"); cityList.add("wichita, Kansas");
        urlList.add("https://bgky.craigslist.org/"); cityList.add("bowling green, Kentucky");
        urlList.add("https://eastky.craigslist.org/"); cityList.add("eastern kentucky, Kentucky");
        urlList.add("https://lexington.craigslist.org/"); cityList.add("lexington, Kentucky");
        urlList.add("https://louisville.craigslist.org/"); cityList.add("louisville, Kentucky");
        urlList.add("https://owensboro.craigslist.org/"); cityList.add("owensboro, Kentucky");
        urlList.add("https://westky.craigslist.org/"); cityList.add("western KY, Kentucky");
        urlList.add("https://batonrouge.craigslist.org/"); cityList.add("baton rouge, Louisiana");
        urlList.add("https://cenla.craigslist.org/"); cityList.add("central louisiana, Louisiana");
        urlList.add("https://houma.craigslist.org/"); cityList.add("houma, Louisiana");
        urlList.add("https://lafayette.craigslist.org/"); cityList.add("lafayette, Louisiana");
        urlList.add("https://lakecharles.craigslist.org/"); cityList.add("lake charles, Louisiana");
        urlList.add("https://monroe.craigslist.org/"); cityList.add("monroe, Louisiana");
        urlList.add("https://neworleans.craigslist.org/"); cityList.add("new orleans, Louisiana");
        urlList.add("https://shreveport.craigslist.org/"); cityList.add("shreveport, Louisiana");
        urlList.add("https://maine.craigslist.org/"); cityList.add("maine, Maine");
        urlList.add("https://annapolis.craigslist.org/"); cityList.add("annapolis, Maryland");
        urlList.add("https://baltimore.craigslist.org/"); cityList.add("baltimore, Maryland");
        urlList.add("https://easternshore.craigslist.org/"); cityList.add("eastern shore, Maryland");
        urlList.add("https://frederick.craigslist.org/"); cityList.add("frederick, Maryland");
        urlList.add("https://smd.craigslist.org/"); cityList.add("southern maryland, Maryland");
        urlList.add("https://westmd.craigslist.org/"); cityList.add("western maryland, Maryland");
        urlList.add("https://boston.craigslist.org/"); cityList.add("boston, Massachusetts");
        urlList.add("https://capecod.craigslist.org/"); cityList.add("cape cod / islands, Massachusetts");
        urlList.add("https://southcoast.craigslist.org/"); cityList.add("south coast, Massachusetts");
        urlList.add("https://westernmass.craigslist.org/"); cityList.add("western massachusetts, Massachusetts");
        urlList.add("https://worcester.craigslist.org/"); cityList.add("worcester / central MA, Massachusetts");
        urlList.add("https://annarbor.craigslist.org/"); cityList.add("ann arbor, Michigan");
        urlList.add("https://battlecreek.craigslist.org/"); cityList.add("battle creek, Michigan");
        urlList.add("https://centralmich.craigslist.org/"); cityList.add("central michigan, Michigan");
        urlList.add("https://detroit.craigslist.org/"); cityList.add("detroit metro, Michigan");
        urlList.add("https://flint.craigslist.org/"); cityList.add("flint, Michigan");
        urlList.add("https://grandrapids.craigslist.org/"); cityList.add("grand rapids, Michigan");
        urlList.add("https://holland.craigslist.org/"); cityList.add("holland, Michigan");
        urlList.add("https://jxn.craigslist.org/"); cityList.add("jackson, Michigan");
        urlList.add("https://kalamazoo.craigslist.org/"); cityList.add("kalamazoo, Michigan");
        urlList.add("https://lansing.craigslist.org/"); cityList.add("lansing, Michigan");
        urlList.add("https://monroemi.craigslist.org/"); cityList.add("monroe, Michigan");
        urlList.add("https://muskegon.craigslist.org/"); cityList.add("muskegon, Michigan");
        urlList.add("https://nmi.craigslist.org/"); cityList.add("northern michigan, Michigan");
        urlList.add("https://porthuron.craigslist.org/"); cityList.add("port huron, Michigan");
        urlList.add("https://saginaw.craigslist.org/"); cityList.add("saginaw-midland-baycity, Michigan");
        urlList.add("https://swmi.craigslist.org/"); cityList.add("southwest michigan, Michigan");
        urlList.add("https://thumb.craigslist.org/"); cityList.add("the thumb, Michigan");
        urlList.add("https://up.craigslist.org/"); cityList.add("upper peninsula, Michigan");
        urlList.add("https://bemidji.craigslist.org/"); cityList.add("bemidji, Minnesota");
        urlList.add("https://brainerd.craigslist.org/"); cityList.add("brainerd, Minnesota");
        urlList.add("https://duluth.craigslist.org/"); cityList.add("duluth / superior, Minnesota");
        urlList.add("https://mankato.craigslist.org/"); cityList.add("mankato, Minnesota");
        urlList.add("https://minneapolis.craigslist.org/"); cityList.add("minneapolis / st paul, Minnesota");
        urlList.add("https://rmn.craigslist.org/"); cityList.add("rochester, Minnesota");
        urlList.add("https://marshall.craigslist.org/"); cityList.add("southwest MN, Minnesota");
        urlList.add("https://stcloud.craigslist.org/"); cityList.add("st cloud, Minnesota");
        urlList.add("https://gulfport.craigslist.org/"); cityList.add("gulfport / biloxi, Mississippi");
        urlList.add("https://hattiesburg.craigslist.org/"); cityList.add("hattiesburg, Mississippi");
        urlList.add("https://jackson.craigslist.org/"); cityList.add("jackson, Mississippi");
        urlList.add("https://meridian.craigslist.org/"); cityList.add("meridian, Mississippi");
        urlList.add("https://northmiss.craigslist.org/"); cityList.add("north mississippi, Mississippi");
        urlList.add("https://natchez.craigslist.org/"); cityList.add("southwest MS, Mississippi");
        urlList.add("https://columbiamo.craigslist.org/"); cityList.add("columbia / jeff city, Missouri");
        urlList.add("https://joplin.craigslist.org/"); cityList.add("joplin, Missouri");
        urlList.add("https://kansascity.craigslist.org/"); cityList.add("kansas city, Missouri");
        urlList.add("https://kirksville.craigslist.org/"); cityList.add("kirksville, Missouri");
        urlList.add("https://loz.craigslist.org/"); cityList.add("lake of the ozarks, Missouri");
        urlList.add("https://semo.craigslist.org/"); cityList.add("southeast missouri, Missouri");
        urlList.add("https://springfield.craigslist.org/"); cityList.add("springfield, Missouri");
        urlList.add("https://stjoseph.craigslist.org/"); cityList.add("st joseph, Missouri");
        urlList.add("https://stlouis.craigslist.org/"); cityList.add("st louis, Missouri");
        urlList.add("https://billings.craigslist.org/"); cityList.add("billings, Montana");
        urlList.add("https://bozeman.craigslist.org/"); cityList.add("bozeman, Montana");
        urlList.add("https://butte.craigslist.org/"); cityList.add("butte, Montana");
        urlList.add("https://greatfalls.craigslist.org/"); cityList.add("great falls, Montana");
        urlList.add("https://helena.craigslist.org/"); cityList.add("helena, Montana");
        urlList.add("https://kalispell.craigslist.org/"); cityList.add("kalispell, Montana");
        urlList.add("https://missoula.craigslist.org/"); cityList.add("missoula, Montana");
        urlList.add("https://montana.craigslist.org/"); cityList.add("eastern montana, Montana");
        urlList.add("https://grandisland.craigslist.org/"); cityList.add("grand island, Nebraska");
        urlList.add("https://lincoln.craigslist.org/"); cityList.add("lincoln, Nebraska");
        urlList.add("https://northplatte.craigslist.org/"); cityList.add("north platte, Nebraska");
        urlList.add("https://omaha.craigslist.org/"); cityList.add("omaha / council bluffs, Nebraska");
        urlList.add("https://scottsbluff.craigslist.org/"); cityList.add("scottsbluff / panhandle, Nebraska");
        urlList.add("https://elko.craigslist.org/"); cityList.add("elko, Nevada");
        urlList.add("https://lasvegas.craigslist.org/"); cityList.add("las vegas, Nevada");
        urlList.add("https://reno.craigslist.org/"); cityList.add("reno / tahoe, Nevada");
        urlList.add("https://nh.craigslist.org/"); cityList.add("new hampshire, New Hampshire");
        urlList.add("https://cnj.craigslist.org/"); cityList.add("central NJ, New Jersey");
        urlList.add("https://jerseyshore.craigslist.org/"); cityList.add("jersey shore, New Jersey");
        urlList.add("https://newjersey.craigslist.org/"); cityList.add("north jersey, New Jersey");
        urlList.add("https://southjersey.craigslist.org/"); cityList.add("south jersey, New Jersey");
        urlList.add("https://albuquerque.craigslist.org/"); cityList.add("albuquerque, New Mexico");
        urlList.add("https://clovis.craigslist.org/"); cityList.add("clovis / portales, New Mexico");
        urlList.add("https://farmington.craigslist.org/"); cityList.add("farmington, New Mexico");
        urlList.add("https://lascruces.craigslist.org/"); cityList.add("las cruces, New Mexico");
        urlList.add("https://roswell.craigslist.org/"); cityList.add("roswell / carlsbad, New Mexico");
        urlList.add("https://santafe.craigslist.org/"); cityList.add("santa fe / taos, New Mexico");
        urlList.add("https://albany.craigslist.org/"); cityList.add("albany, New York");
        urlList.add("https://binghamton.craigslist.org/"); cityList.add("binghamton, New York");
        urlList.add("https://buffalo.craigslist.org/"); cityList.add("buffalo, New York");
        urlList.add("https://catskills.craigslist.org/"); cityList.add("catskills, New York");
        urlList.add("https://chautauqua.craigslist.org/"); cityList.add("chautauqua, New York");
        urlList.add("https://elmira.craigslist.org/"); cityList.add("elmira-corning, New York");
        urlList.add("https://fingerlakes.craigslist.org/"); cityList.add("finger lakes, New York");
        urlList.add("https://glensfalls.craigslist.org/"); cityList.add("glens falls, New York");
        urlList.add("https://hudsonvalley.craigslist.org/"); cityList.add("hudson valley, New York");
        urlList.add("https://ithaca.craigslist.org/"); cityList.add("ithaca, New York");
        urlList.add("https://longisland.craigslist.org/"); cityList.add("long island, New York");
        urlList.add("https://newyork.craigslist.org/"); cityList.add("new york city, New York");
        urlList.add("https://oneonta.craigslist.org/"); cityList.add("oneonta, New York");
        urlList.add("https://plattsburgh.craigslist.org/"); cityList.add("plattsburgh-adirondacks, New York");
        urlList.add("https://potsdam.craigslist.org/"); cityList.add("potsdam-canton-massena, New York");
        urlList.add("https://rochester.craigslist.org/"); cityList.add("rochester, New York");
        urlList.add("https://syracuse.craigslist.org/"); cityList.add("syracuse, New York");
        urlList.add("https://twintiers.craigslist.org/"); cityList.add("twin tiers NY/PA, New York");
        urlList.add("https://utica.craigslist.org/"); cityList.add("utica-rome-oneida, New York");
        urlList.add("https://watertown.craigslist.org/"); cityList.add("watertown, New York");
        urlList.add("https://asheville.craigslist.org/"); cityList.add("asheville, North Carolina");
        urlList.add("https://boone.craigslist.org/"); cityList.add("boone, North Carolina");
        urlList.add("https://charlotte.craigslist.org/"); cityList.add("charlotte, North Carolina");
        urlList.add("https://eastnc.craigslist.org/"); cityList.add("eastern NC, North Carolina");
        urlList.add("https://fayetteville.craigslist.org/"); cityList.add("fayetteville, North Carolina");
        urlList.add("https://greensboro.craigslist.org/"); cityList.add("greensboro, North Carolina");
        urlList.add("https://hickory.craigslist.org/"); cityList.add("hickory / lenoir, North Carolina");
        urlList.add("https://onslow.craigslist.org/"); cityList.add("jacksonville, North Carolina");
        urlList.add("https://outerbanks.craigslist.org/"); cityList.add("outer banks, North Carolina");
        urlList.add("https://raleigh.craigslist.org/"); cityList.add("raleigh / durham / CH, North Carolina");
        urlList.add("https://wilmington.craigslist.org/"); cityList.add("wilmington, North Carolina");
        urlList.add("https://winstonsalem.craigslist.org/"); cityList.add("winston-salem, North Carolina");
        urlList.add("https://bismarck.craigslist.org/"); cityList.add("bismarck, North Dakota");
        urlList.add("https://fargo.craigslist.org/"); cityList.add("fargo / moorhead, North Dakota");
        urlList.add("https://grandforks.craigslist.org/"); cityList.add("grand forks, North Dakota");
        urlList.add("https://nd.craigslist.org/"); cityList.add("north dakota, North Dakota");
        urlList.add("https://akroncanton.craigslist.org/"); cityList.add("akron / canton, Ohio");
        urlList.add("https://ashtabula.craigslist.org/"); cityList.add("ashtabula, Ohio");
        urlList.add("https://athensohio.craigslist.org/"); cityList.add("athens, Ohio");
        urlList.add("https://chillicothe.craigslist.org/"); cityList.add("chillicothe, Ohio");
        urlList.add("https://cincinnati.craigslist.org/"); cityList.add("cincinnati, Ohio");
        urlList.add("https://cleveland.craigslist.org/"); cityList.add("cleveland, Ohio");
        urlList.add("https://columbus.craigslist.org/"); cityList.add("columbus, Ohio");
        urlList.add("https://dayton.craigslist.org/"); cityList.add("dayton / springfield, Ohio");
        urlList.add("https://limaohio.craigslist.org/"); cityList.add("lima / findlay, Ohio");
        urlList.add("https://mansfield.craigslist.org/"); cityList.add("mansfield, Ohio");
        urlList.add("https://sandusky.craigslist.org/"); cityList.add("sandusky, Ohio");
        urlList.add("https://toledo.craigslist.org/"); cityList.add("toledo, Ohio");
        urlList.add("https://tuscarawas.craigslist.org/"); cityList.add("tuscarawas co, Ohio");
        urlList.add("https://youngstown.craigslist.org/"); cityList.add("youngstown, Ohio");
        urlList.add("https://zanesville.craigslist.org/"); cityList.add("zanesville / cambridge, Ohio");
        urlList.add("https://lawton.craigslist.org/"); cityList.add("lawton, Oklahoma");
        urlList.add("https://enid.craigslist.org/"); cityList.add("northwest OK, Oklahoma");
        urlList.add("https://oklahomacity.craigslist.org/"); cityList.add("oklahoma city, Oklahoma");
        urlList.add("https://stillwater.craigslist.org/"); cityList.add("stillwater, Oklahoma");
        urlList.add("https://tulsa.craigslist.org/"); cityList.add("tulsa, Oklahoma");
        urlList.add("https://bend.craigslist.org/"); cityList.add("bend, Oregon");
        urlList.add("https://corvallis.craigslist.org/"); cityList.add("corvallis/albany, Oregon");
        urlList.add("https://eastoregon.craigslist.org/"); cityList.add("east oregon, Oregon");
        urlList.add("https://eugene.craigslist.org/"); cityList.add("eugene, Oregon");
        urlList.add("https://klamath.craigslist.org/"); cityList.add("klamath falls, Oregon");
        urlList.add("https://medford.craigslist.org/"); cityList.add("medford-ashland, Oregon");
        urlList.add("https://oregoncoast.craigslist.org/"); cityList.add("oregon coast, Oregon");
        urlList.add("https://portland.craigslist.org/"); cityList.add("portland, Oregon");
        urlList.add("https://roseburg.craigslist.org/"); cityList.add("roseburg, Oregon");
        urlList.add("https://salem.craigslist.org/"); cityList.add("salem, Oregon");
        urlList.add("https://altoona.craigslist.org/"); cityList.add("altoona-johnstown, Pennsylvania");
        urlList.add("https://chambersburg.craigslist.org/"); cityList.add("cumberland valley, Pennsylvania");
        urlList.add("https://erie.craigslist.org/"); cityList.add("erie, Pennsylvania");
        urlList.add("https://harrisburg.craigslist.org/"); cityList.add("harrisburg, Pennsylvania");
        urlList.add("https://lancaster.craigslist.org/"); cityList.add("lancaster, Pennsylvania");
        urlList.add("https://allentown.craigslist.org/"); cityList.add("lehigh valley, Pennsylvania");
        urlList.add("https://meadville.craigslist.org/"); cityList.add("meadville, Pennsylvania");
        urlList.add("https://philadelphia.craigslist.org/"); cityList.add("philadelphia, Pennsylvania");
        urlList.add("https://pittsburgh.craigslist.org/"); cityList.add("pittsburgh, Pennsylvania");
        urlList.add("https://poconos.craigslist.org/"); cityList.add("poconos, Pennsylvania");
        urlList.add("https://reading.craigslist.org/"); cityList.add("reading, Pennsylvania");
        urlList.add("https://scranton.craigslist.org/"); cityList.add("scranton / wilkes-barre, Pennsylvania");
        urlList.add("https://pennstate.craigslist.org/"); cityList.add("state college, Pennsylvania");
        urlList.add("https://williamsport.craigslist.org/"); cityList.add("williamsport, Pennsylvania");
        urlList.add("https://york.craigslist.org/"); cityList.add("york, Pennsylvania");
        urlList.add("https://providence.craigslist.org/"); cityList.add("rhode island, Rhode Island");
        urlList.add("https://charleston.craigslist.org/"); cityList.add("charleston, South Carolina");
        urlList.add("https://columbia.craigslist.org/"); cityList.add("columbia, South Carolina");
        urlList.add("https://florencesc.craigslist.org/"); cityList.add("florence, South Carolina");
        urlList.add("https://greenville.craigslist.org/"); cityList.add("greenville / upstate, South Carolina");
        urlList.add("https://hiltonhead.craigslist.org/"); cityList.add("hilton head, South Carolina");
        urlList.add("https://myrtlebeach.craigslist.org/"); cityList.add("myrtle beach, South Carolina");
        urlList.add("https://nesd.craigslist.org/"); cityList.add("northeast SD, South Dakota");
        urlList.add("https://csd.craigslist.org/"); cityList.add("pierre / central SD, South Dakota");
        urlList.add("https://rapidcity.craigslist.org/"); cityList.add("rapid city / west SD, South Dakota");
        urlList.add("https://siouxfalls.craigslist.org/"); cityList.add("sioux falls / SE SD, South Dakota");
        urlList.add("https://sd.craigslist.org/"); cityList.add("south dakota");
        urlList.add("https://chattanooga.craigslist.org/"); cityList.add("chattanooga, Tennessee");
        urlList.add("https://clarksville.craigslist.org/"); cityList.add("clarksville, Tennessee");
        urlList.add("https://cookeville.craigslist.org/"); cityList.add("cookeville, Tennessee");
        urlList.add("https://jacksontn.craigslist.org/"); cityList.add("jackson, Tennessee");
        urlList.add("https://knoxville.craigslist.org/"); cityList.add("knoxville, Tennessee");
        urlList.add("https://memphis.craigslist.org/"); cityList.add("memphis, Tennessee");
        urlList.add("https://nashville.craigslist.org/"); cityList.add("nashville, Tennessee");
        urlList.add("https://tricities.craigslist.org/"); cityList.add("tri-cities, Tennessee");
        urlList.add("https://abilene.craigslist.org/"); cityList.add("abilene, Texas");
        urlList.add("https://amarillo.craigslist.org/"); cityList.add("amarillo, Texas");
        urlList.add("https://austin.craigslist.org/"); cityList.add("austin, Texas");
        urlList.add("https://beaumont.craigslist.org/"); cityList.add("beaumont / port arthur, Texas");
        urlList.add("https://brownsville.craigslist.org/"); cityList.add("brownsville, Texas");
        urlList.add("https://collegestation.craigslist.org/"); cityList.add("college station, Texas");
        urlList.add("https://corpuschristi.craigslist.org/"); cityList.add("corpus christi, Texas");
        urlList.add("https://dallas.craigslist.org/"); cityList.add("dallas / fort worth, Texas");
        urlList.add("https://nacogdoches.craigslist.org/"); cityList.add("deep east texas, Texas");
        urlList.add("https://delrio.craigslist.org/"); cityList.add("del rio / eagle pass, Texas");
        urlList.add("https://elpaso.craigslist.org/"); cityList.add("el paso, Texas");
        urlList.add("https://galveston.craigslist.org/"); cityList.add("galveston, Texas");
        urlList.add("https://houston.craigslist.org/"); cityList.add("houston, Texas");
        urlList.add("https://killeen.craigslist.org/"); cityList.add("killeen / temple / ft hood, Texas");
        urlList.add("https://laredo.craigslist.org/"); cityList.add("laredo, Texas");
        urlList.add("https://lubbock.craigslist.org/"); cityList.add("lubbock, Texas");
        urlList.add("https://mcallen.craigslist.org/"); cityList.add("mcallen / edinburg, Texas");
        urlList.add("https://odessa.craigslist.org/"); cityList.add("odessa / midland, Texas");
        urlList.add("https://sanangelo.craigslist.org/"); cityList.add("san angelo, Texas");
        urlList.add("https://sanantonio.craigslist.org/"); cityList.add("san antonio, Texas");
        urlList.add("https://sanmarcos.craigslist.org/"); cityList.add("san marcos, Texas");
        urlList.add("https://bigbend.craigslist.org/"); cityList.add("southwest TX, Texas");
        urlList.add("https://texoma.craigslist.org/"); cityList.add("texoma, Texas");
        urlList.add("https://easttexas.craigslist.org/"); cityList.add("tyler / east TX, Texas");
        urlList.add("https://victoriatx.craigslist.org/"); cityList.add("victoria, Texas");
        urlList.add("https://waco.craigslist.org/"); cityList.add("waco, Texas");
        urlList.add("https://wichitafalls.craigslist.org/"); cityList.add("wichita falls, Texas");
        urlList.add("https://logan.craigslist.org/"); cityList.add("logan, Utah");
        urlList.add("https://ogden.craigslist.org/"); cityList.add("ogden-clearfield, Utah");
        urlList.add("https://provo.craigslist.org/"); cityList.add("provo / orem, Utah");
        urlList.add("https://saltlakecity.craigslist.org/"); cityList.add("salt lake city, Utah");
        urlList.add("https://stgeorge.craigslist.org/"); cityList.add("st george, Utah");
        urlList.add("https://vermont.craigslist.org/"); cityList.add("vermont, Vermont");
        urlList.add("https://charlottesville.craigslist.org/"); cityList.add("charlottesville, Virginia");
        urlList.add("https://danville.craigslist.org/"); cityList.add("danville, Virginia");
        urlList.add("https://fredericksburg.craigslist.org/"); cityList.add("fredericksburg, Virginia");
        urlList.add("https://norfolk.craigslist.org/"); cityList.add("hampton roads, Virginia");
        urlList.add("https://harrisonburg.craigslist.org/"); cityList.add("harrisonburg, Virginia");
        urlList.add("https://lynchburg.craigslist.org/"); cityList.add("lynchburg, Virginia");
        urlList.add("https://blacksburg.craigslist.org/"); cityList.add("new river valley, Virginia");
        urlList.add("https://richmond.craigslist.org/"); cityList.add("richmond, Virginia");
        urlList.add("https://roanoke.craigslist.org/"); cityList.add("roanoke, Virginia");
        urlList.add("https://swva.craigslist.org/"); cityList.add("southwest VA, Virginia");
        urlList.add("https://winchester.craigslist.org/"); cityList.add("winchester, Virginia");
        urlList.add("https://bellingham.craigslist.org/"); cityList.add("bellingham, Washington");
        urlList.add("https://kpr.craigslist.org/"); cityList.add("kennewick-pasco-richland, Washington");
        urlList.add("https://moseslake.craigslist.org/"); cityList.add("moses lake, Washington");
        urlList.add("https://olympic.craigslist.org/"); cityList.add("olympic peninsula, Washington");
        urlList.add("https://pullman.craigslist.org/"); cityList.add("pullman / moscow, Washington");
        urlList.add("https://seattle.craigslist.org/"); cityList.add("seattle-tacoma, Washington");
        urlList.add("https://skagit.craigslist.org/"); cityList.add("skagit / island / SJI, Washington");
        urlList.add("https://spokane.craigslist.org/"); cityList.add("spokane / coeur d'alene, Washington");
        urlList.add("https://wenatchee.craigslist.org/"); cityList.add("wenatchee, Washington");
        urlList.add("https://yakima.craigslist.org/"); cityList.add("yakima, Washington");
        urlList.add("https://charlestonwv.craigslist.org/"); cityList.add("charleston, West Virginia");
        urlList.add("https://martinsburg.craigslist.org/"); cityList.add("eastern panhandle, West Virginia");
        urlList.add("https://huntington.craigslist.org/"); cityList.add("huntington-ashland, West Virginia");
        urlList.add("https://morgantown.craigslist.org/"); cityList.add("morgantown, West Virginia");
        urlList.add("https://wheeling.craigslist.org/"); cityList.add("northern panhandle, West Virginia");
        urlList.add("https://parkersburg.craigslist.org/"); cityList.add("parkersburg-marietta, West Virginia");
        urlList.add("https://swv.craigslist.org/"); cityList.add("southern WV, West Virginia");
        urlList.add("https://wv.craigslist.org/"); cityList.add("west virginia (old), West Virginia");
        urlList.add("https://appleton.craigslist.org/"); cityList.add("appleton-oshkosh-FDL, Wisconsin");
        urlList.add("https://eauclaire.craigslist.org/"); cityList.add("eau claire, Wisconsin");
        urlList.add("https://greenbay.craigslist.org/"); cityList.add("green bay, Wisconsin");
        urlList.add("https://janesville.craigslist.org/"); cityList.add("janesville, Wisconsin");
        urlList.add("https://racine.craigslist.org/"); cityList.add("kenosha-racine, Wisconsin");
        urlList.add("https://lacrosse.craigslist.org/"); cityList.add("la crosse, Wisconsin");
        urlList.add("https://madison.craigslist.org/"); cityList.add("madison, Wisconsin");
        urlList.add("https://milwaukee.craigslist.org/"); cityList.add("milwaukee, Wisconsin");
        urlList.add("https://northernwi.craigslist.org/"); cityList.add("northern WI, Wisconsin");
        urlList.add("https://sheboygan.craigslist.org/"); cityList.add("sheboygan, Wisconsin");
        urlList.add("https://wausau.craigslist.org/"); cityList.add("wausau, Wisconsin");
        urlList.add("https://wyoming.craigslist.org/"); cityList.add("wyoming, Wyoming");
        urlList.add("https://micronesia.craigslist.org/"); cityList.add("guam-micronesia, Territories");
        urlList.add("https://puertorico.craigslist.org/"); cityList.add("puerto rico, Territories");
        urlList.add("https://virgin.craigslist.org/"); cityList.add("U.S. virgin islands, Territories");
        urlList.add("https://calgary.craigslist.ca/"); cityList.add("calgary, Alberta");
        urlList.add("https://edmonton.craigslist.ca/"); cityList.add("edmonton, Alberta");
        urlList.add("https://ftmcmurray.craigslist.ca/"); cityList.add("ft mcmurray, Alberta");
        urlList.add("https://lethbridge.craigslist.ca/"); cityList.add("lethbridge, Alberta");
        urlList.add("https://hat.craigslist.ca/"); cityList.add("medicine hat, Alberta");
        urlList.add("https://peace.craigslist.ca/"); cityList.add("peace river country, Alberta");
        urlList.add("https://reddeer.craigslist.ca/"); cityList.add("red deer, Alberta");
        urlList.add("https://cariboo.craigslist.ca/"); cityList.add("cariboo, British Columbia");
        urlList.add("https://comoxvalley.craigslist.ca/"); cityList.add("comox valley, British Columbia");
        urlList.add("https://abbotsford.craigslist.ca/"); cityList.add("fraser valley, British Columbia");
        urlList.add("https://kamloops.craigslist.ca/"); cityList.add("kamloops, British Columbia");
        urlList.add("https://kelowna.craigslist.ca/"); cityList.add("kelowna / okanagan, British Columbia");
        urlList.add("https://kootenays.craigslist.ca/"); cityList.add("kootenays, British Columbia");
        urlList.add("https://nanaimo.craigslist.ca/"); cityList.add("nanaimo, British Columbia");
        urlList.add("https://princegeorge.craigslist.ca/"); cityList.add("prince george, British Columbia");
        urlList.add("https://skeena.craigslist.ca/"); cityList.add("skeena-bulkley, British Columbia");
        urlList.add("https://sunshine.craigslist.ca/"); cityList.add("sunshine coast, British Columbia");
        urlList.add("https://vancouver.craigslist.ca/"); cityList.add("vancouver, British Columbia");
        urlList.add("https://victoria.craigslist.ca/"); cityList.add("victoria, British Columbia");
        urlList.add("https://whistler.craigslist.ca/"); cityList.add("whistler, British Columbia");
        urlList.add("https://winnipeg.craigslist.ca/"); cityList.add("winnipeg, Manitoba");
        urlList.add("https://newbrunswick.craigslist.ca/"); cityList.add("new brunswick, New Brunswick");
        urlList.add("https://newfoundland.craigslist.ca/"); cityList.add("st john's, Newfoundland and Labrador");
        urlList.add("https://territories.craigslist.ca/"); cityList.add("territories, Northwest Territories");
        urlList.add("https://yellowknife.craigslist.ca/"); cityList.add("yellowknife, Northwest Territories");
        urlList.add("https://halifax.craigslist.ca/"); cityList.add("halifax, Nova Scotia");
        urlList.add("https://barrie.craigslist.ca/"); cityList.add("barrie, Ontario");
        urlList.add("https://belleville.craigslist.ca/"); cityList.add("belleville, Ontario");
        urlList.add("https://brantford.craigslist.ca/"); cityList.add("brantford-woodstock, Ontario");
        urlList.add("https://chatham.craigslist.ca/"); cityList.add("chatham-kent, Ontario");
        urlList.add("https://cornwall.craigslist.ca/"); cityList.add("cornwall, Ontario");
        urlList.add("https://guelph.craigslist.ca/"); cityList.add("guelph, Ontario");
        urlList.add("https://hamilton.craigslist.ca/"); cityList.add("hamilton-burlington, Ontario");
        urlList.add("https://kingston.craigslist.ca/"); cityList.add("kingston, Ontario");
        urlList.add("https://kitchener.craigslist.ca/"); cityList.add("kitchener-waterloo-cambridge, Ontario");
        urlList.add("https://londonon.craigslist.ca/"); cityList.add("london, Ontario");
        urlList.add("https://niagara.craigslist.ca/"); cityList.add("niagara region, Ontario");
        urlList.add("https://ottawa.craigslist.ca/"); cityList.add("ottawa-hull-gatineau, Ontario");
        urlList.add("https://owensound.craigslist.ca/"); cityList.add("owen sound, Ontario");
        urlList.add("https://peterborough.craigslist.ca/"); cityList.add("peterborough, Ontario");
        urlList.add("https://sarnia.craigslist.ca/"); cityList.add("sarnia, Ontario");
        urlList.add("https://soo.craigslist.ca/"); cityList.add("sault ste marie, Ontario");
        urlList.add("https://sudbury.craigslist.ca/"); cityList.add("sudbury, Ontario");
        urlList.add("https://thunderbay.craigslist.ca/"); cityList.add("thunder bay, Ontario");
        urlList.add("https://toronto.craigslist.ca/"); cityList.add("toronto, Ontario");
        urlList.add("https://windsor.craigslist.ca/"); cityList.add("windsor, Ontario");
        urlList.add("https://pei.craigslist.ca/"); cityList.add("prince edward island, Prince Edward Island");
        urlList.add("https://montreal.craigslist.ca/"); cityList.add("montreal, Quebec");
        urlList.add("https://quebec.craigslist.ca/"); cityList.add("quebec city, Quebec");
        urlList.add("https://saguenay.craigslist.ca/"); cityList.add("saguenay, Quebec");
        urlList.add("https://sherbrooke.craigslist.ca/"); cityList.add("sherbrooke, Quebec");
        urlList.add("https://troisrivieres.craigslist.ca/"); cityList.add("trois-rivieres, Quebec");
        urlList.add("https://regina.craigslist.ca/"); cityList.add("regina, Saskatchewan");
        urlList.add("https://saskatoon.craigslist.ca/"); cityList.add("saskatoon, Saskatchewan");
        urlList.add("https://whitehorse.craigslist.ca/"); cityList.add("whitehorse, Yukon Territory");
        urlList.add("https://vienna.craigslist.at/"); cityList.add("vienna, Austria");
        urlList.add("https://brussels.craigslist.org/"); cityList.add("belgium");
        urlList.add("https://bulgaria.craigslist.org/"); cityList.add("bulgaria");
        urlList.add("https://zagreb.craigslist.org/"); cityList.add("croatia");
        urlList.add("http://prague.craigslist.cz/"); cityList.add("prague, Czech Republic");
        urlList.add("https://copenhagen.craigslist.org/"); cityList.add("copenhagen, Denmark");
        urlList.add("http://helsinki.craigslist.fi/"); cityList.add("finland");
        urlList.add("https://bordeaux.craigslist.org/"); cityList.add("bordeaux, France");
        urlList.add("https://rennes.craigslist.org/"); cityList.add("brittany, France");
        urlList.add("https://grenoble.craigslist.org/"); cityList.add("grenoble, France");
        urlList.add("https://lille.craigslist.org/"); cityList.add("lille, France");
        urlList.add("https://loire.craigslist.org/"); cityList.add("loire valley, France");
        urlList.add("https://lyon.craigslist.org/"); cityList.add("lyon, France");
        urlList.add("https://marseilles.craigslist.org/"); cityList.add("marseille, France");
        urlList.add("https://montpellier.craigslist.org/"); cityList.add("montpellier, France");
        urlList.add("https://cotedazur.craigslist.org/"); cityList.add("nice / cote d'azur, France");
        urlList.add("https://rouen.craigslist.org/"); cityList.add("normandy, France");
        urlList.add("https://paris.craigslist.org/"); cityList.add("paris, France");
        urlList.add("https://strasbourg.craigslist.org/"); cityList.add("strasbourg, France");
        urlList.add("https://toulouse.craigslist.org/"); cityList.add("toulouse, France");
        urlList.add("https://berlin.craigslist.de/"); cityList.add("berlin, Germany");
        urlList.add("https://bremen.craigslist.de/"); cityList.add("bremen, Germany");
        urlList.add("https://cologne.craigslist.de/"); cityList.add("cologne, Germany");
        urlList.add("https://dresden.craigslist.de/"); cityList.add("dresden, Germany");
        urlList.add("https://dusseldorf.craigslist.de/"); cityList.add("dusseldorf, Germany");
        urlList.add("https://essen.craigslist.de/"); cityList.add("essen / ruhr, Germany");
        urlList.add("https://frankfurt.craigslist.de/"); cityList.add("frankfurt, Germany");
        urlList.add("https://hamburg.craigslist.de/"); cityList.add("hamburg, Germany");
        urlList.add("https://hannover.craigslist.de/"); cityList.add("hannover, Germany");
        urlList.add("https://heidelberg.craigslist.de/"); cityList.add("heidelberg, Germany");
        urlList.add("https://kaiserslautern.craigslist.de/"); cityList.add("kaiserslautern, Germany");
        urlList.add("https://leipzig.craigslist.de/"); cityList.add("leipzig, Germany");
        urlList.add("https://munich.craigslist.de/"); cityList.add("munich, Germany");
        urlList.add("https://nuremberg.craigslist.de/"); cityList.add("nuremberg, Germany");
        urlList.add("https://stuttgart.craigslist.de/"); cityList.add("stuttgart, Germany");
        urlList.add("http://athens.craigslist.gr/"); cityList.add("greece");
        urlList.add("https://budapest.craigslist.org/"); cityList.add("budapest, Hungary");
        urlList.add("https://reykjavik.craigslist.org/"); cityList.add("reykjavik, Iceland");
        urlList.add("https://dublin.craigslist.org/"); cityList.add("dublin, Ireland");
        urlList.add("https://bologna.craigslist.it/"); cityList.add("bologna, Italy");
        urlList.add("https://florence.craigslist.it/"); cityList.add("florence / tuscany, Italy");
        urlList.add("https://genoa.craigslist.it/"); cityList.add("genoa, Italy");
        urlList.add("https://milan.craigslist.it/"); cityList.add("milan, Italy");
        urlList.add("https://naples.craigslist.it/"); cityList.add("napoli / campania, Italy");
        urlList.add("https://perugia.craigslist.it/"); cityList.add("perugia, Italy");
        urlList.add("https://rome.craigslist.it/"); cityList.add("rome, Italy");
        urlList.add("https://sardinia.craigslist.it/"); cityList.add("sardinia, Italy");
        urlList.add("https://sicily.craigslist.it/"); cityList.add("sicilia, Italy");
        urlList.add("https://torino.craigslist.it/"); cityList.add("torino, Italy");
        urlList.add("https://venice.craigslist.it/"); cityList.add("venice / veneto, Italy");
        urlList.add("https://luxembourg.craigslist.org/"); cityList.add("luxembourg");
        urlList.add("https://amsterdam.craigslist.org/"); cityList.add("amsterdam / randstad, Netherlands");
        urlList.add("https://oslo.craigslist.org/"); cityList.add("norway");
        urlList.add("http://warsaw.craigslist.pl/"); cityList.add("poland");
        urlList.add("http://faro.craigslist.pt/"); cityList.add("faro / algarve, Portugal");
        urlList.add("http://lisbon.craigslist.pt/"); cityList.add("lisbon, Portugal");
        urlList.add("http://porto.craigslist.pt/"); cityList.add("porto, Portugal");
        urlList.add("https://bucharest.craigslist.org/"); cityList.add("romania");
        urlList.add("https://moscow.craigslist.org/"); cityList.add("moscow, Russian Federation");
        urlList.add("https://stpetersburg.craigslist.org/"); cityList.add("st petersburg, Russian Federation");
        urlList.add("https://alicante.craigslist.es/"); cityList.add("alicante, Spain");
        urlList.add("https://baleares.craigslist.es/"); cityList.add("baleares, Spain");
        urlList.add("https://barcelona.craigslist.es/"); cityList.add("barcelona, Spain");
        urlList.add("https://bilbao.craigslist.es/"); cityList.add("bilbao, Spain");
        urlList.add("https://cadiz.craigslist.es/"); cityList.add("cadiz, Spain");
        urlList.add("https://canarias.craigslist.es/"); cityList.add("canarias, Spain");
        urlList.add("https://granada.craigslist.es/"); cityList.add("granada, Spain");
        urlList.add("https://madrid.craigslist.es/"); cityList.add("madrid, Spain");
        urlList.add("https://malaga.craigslist.es/"); cityList.add("malaga, Spain");
        urlList.add("https://sevilla.craigslist.es/"); cityList.add("sevilla, Spain");
        urlList.add("https://valencia.craigslist.es/"); cityList.add("valencia, Spain");
        urlList.add("https://stockholm.craigslist.se/"); cityList.add("sweden");
        urlList.add("https://basel.craigslist.ch/"); cityList.add("basel, Switzerland");
        urlList.add("https://bern.craigslist.ch/"); cityList.add("bern, Switzerland");
        urlList.add("https://geneva.craigslist.ch/"); cityList.add("geneva, Switzerland");
        urlList.add("https://lausanne.craigslist.ch/"); cityList.add("lausanne, Switzerland");
        urlList.add("https://zurich.craigslist.ch/"); cityList.add("zurich, Switzerland");
        urlList.add("https://istanbul.craigslist.com.tr/"); cityList.add("turkey");
        urlList.add("https://ukraine.craigslist.org/"); cityList.add("ukraine");
        urlList.add("https://aberdeen.craigslist.co.uk/"); cityList.add("aberdeen, United Kingdom");
        urlList.add("https://bath.craigslist.co.uk/"); cityList.add("bath, United Kingdom");
        urlList.add("https://belfast.craigslist.co.uk/"); cityList.add("belfast, United Kingdom");
        urlList.add("https://birmingham.craigslist.co.uk/"); cityList.add("birmingham / west mids, United Kingdom");
        urlList.add("https://brighton.craigslist.co.uk/"); cityList.add("brighton, United Kingdom");
        urlList.add("https://bristol.craigslist.co.uk/"); cityList.add("bristol, United Kingdom");
        urlList.add("https://cambridge.craigslist.co.uk/"); cityList.add("cambridge, UK, United Kingdom");
        urlList.add("https://cardiff.craigslist.co.uk/"); cityList.add("cardiff / wales, United Kingdom");
        urlList.add("https://coventry.craigslist.co.uk/"); cityList.add("coventry, United Kingdom");
        urlList.add("https://derby.craigslist.co.uk/"); cityList.add("derby, United Kingdom");
        urlList.add("https://devon.craigslist.co.uk/"); cityList.add("devon &amp; cornwall, United Kingdom");
        urlList.add("https://dundee.craigslist.co.uk/"); cityList.add("dundee, United Kingdom");
        urlList.add("https://norwich.craigslist.co.uk/"); cityList.add("east anglia, United Kingdom");
        urlList.add("https://eastmids.craigslist.co.uk/"); cityList.add("east midlands, United Kingdom");
        urlList.add("https://edinburgh.craigslist.co.uk/"); cityList.add("edinburgh, United Kingdom");
        urlList.add("https://essex.craigslist.co.uk/"); cityList.add("essex, United Kingdom");
        urlList.add("https://glasgow.craigslist.co.uk/"); cityList.add("glasgow, United Kingdom");
        urlList.add("https://hampshire.craigslist.co.uk/"); cityList.add("hampshire, United Kingdom");
        urlList.add("https://kent.craigslist.co.uk/"); cityList.add("kent, United Kingdom");
        urlList.add("https://leeds.craigslist.co.uk/"); cityList.add("leeds, United Kingdom");
        urlList.add("https://liverpool.craigslist.co.uk/"); cityList.add("liverpool, United Kingdom");
        urlList.add("https://london.craigslist.co.uk/"); cityList.add("london, United Kingdom");
        urlList.add("https://manchester.craigslist.co.uk/"); cityList.add("manchester, United Kingdom");
        urlList.add("https://newcastle.craigslist.co.uk/"); cityList.add("newcastle / NE england, United Kingdom");
        urlList.add("https://nottingham.craigslist.co.uk/"); cityList.add("nottingham, United Kingdom");
        urlList.add("https://oxford.craigslist.co.uk/"); cityList.add("oxford, United Kingdom");
        urlList.add("https://sheffield.craigslist.co.uk/"); cityList.add("sheffield, United Kingdom");
        urlList.add("https://bangladesh.craigslist.org/"); cityList.add("bangladesh");
        urlList.add("http://beijing.craigslist.com.cn/"); cityList.add("beijing, China");
        urlList.add("http://chengdu.craigslist.com.cn/"); cityList.add("chengdu, China");
        urlList.add("http://chongqing.craigslist.com.cn/"); cityList.add("chongqing, China");
        urlList.add("http://dalian.craigslist.com.cn/"); cityList.add("dalian, China");
        urlList.add("http://guangzhou.craigslist.com.cn/"); cityList.add("guangzhou, China");
        urlList.add("http://hangzhou.craigslist.com.cn/"); cityList.add("hangzhou, China");
        urlList.add("http://nanjing.craigslist.com.cn/"); cityList.add("nanjing, China");
        urlList.add("http://shanghai.craigslist.com.cn/"); cityList.add("shanghai, China");
        urlList.add("http://shenyang.craigslist.com.cn/"); cityList.add("shenyang, China");
        urlList.add("http://shenzhen.craigslist.com.cn/"); cityList.add("shenzhen, China");
        urlList.add("http://wuhan.craigslist.com.cn/"); cityList.add("wuhan, China");
        urlList.add("http://xian.craigslist.com.cn/"); cityList.add("xi'an, China");
        urlList.add("http://hongkong.craigslist.hk/"); cityList.add("hong kong");
        urlList.add("http://ahmedabad.craigslist.co.in/"); cityList.add("ahmedabad, India");
        urlList.add("http://bangalore.craigslist.co.in/"); cityList.add("bangalore, India");
        urlList.add("http://bhubaneswar.craigslist.co.in/"); cityList.add("bhubaneswar, India");
        urlList.add("http://chandigarh.craigslist.co.in/"); cityList.add("chandigarh, India");
        urlList.add("http://chennai.craigslist.co.in/"); cityList.add("chennai (madras), India");
        urlList.add("http://delhi.craigslist.co.in/"); cityList.add("delhi, India");
        urlList.add("http://goa.craigslist.co.in/"); cityList.add("goa, India");
        urlList.add("http://hyderabad.craigslist.co.in/"); cityList.add("hyderabad, India");
        urlList.add("http://indore.craigslist.co.in/"); cityList.add("indore, India");
        urlList.add("http://jaipur.craigslist.co.in/"); cityList.add("jaipur, India");
        urlList.add("http://kerala.craigslist.co.in/"); cityList.add("kerala, India");
        urlList.add("http://kolkata.craigslist.co.in/"); cityList.add("kolkata (calcutta), India");
        urlList.add("http://lucknow.craigslist.co.in/"); cityList.add("lucknow, India");
        urlList.add("http://mumbai.craigslist.co.in/"); cityList.add("mumbai, India");
        urlList.add("http://pune.craigslist.co.in/"); cityList.add("pune, India");
        urlList.add("http://surat.craigslist.co.in/"); cityList.add("surat surat, India");
        urlList.add("https://jakarta.craigslist.org/"); cityList.add("indonesia");
        urlList.add("https://tehran.craigslist.org/"); cityList.add("iran");
        urlList.add("https://baghdad.craigslist.org/"); cityList.add("iraq");
        urlList.add("https://haifa.craigslist.org/"); cityList.add("haifa, Israel and Palestine");
        urlList.add("https://jerusalem.craigslist.org/"); cityList.add("jerusalem, Israel and Palestine");
        urlList.add("https://telaviv.craigslist.org/"); cityList.add("tel aviv, Israel and Palestine");
        urlList.add("https://ramallah.craigslist.org/"); cityList.add("west bank, Israel and Palestine");
        urlList.add("https://fukuoka.craigslist.jp/"); cityList.add("fukuoka, Japan");
        urlList.add("https://hiroshima.craigslist.jp/"); cityList.add("hiroshima, Japan");
        urlList.add("https://nagoya.craigslist.jp/"); cityList.add("nagoya, Japan");
        urlList.add("https://okinawa.craigslist.jp/"); cityList.add("okinawa, Japan");
        urlList.add("https://osaka.craigslist.jp/"); cityList.add("osaka-kobe-kyoto, Japan");
        urlList.add("https://sapporo.craigslist.jp/"); cityList.add("sapporo, Japan");
        urlList.add("https://sendai.craigslist.jp/"); cityList.add("sendai, Japan");
        urlList.add("https://tokyo.craigslist.jp/"); cityList.add("tokyo, Japan");
        urlList.add("http://seoul.craigslist.co.kr/"); cityList.add("seoul, Korea");
        urlList.add("https://kuwait.craigslist.org/"); cityList.add("kuwait");
        urlList.add("https://beirut.craigslist.org/"); cityList.add("beirut, lebanon");
        urlList.add("https://malaysia.craigslist.org/"); cityList.add("malaysia");
        urlList.add("https://pakistan.craigslist.org/"); cityList.add("pakistan");
        urlList.add("https://bacolod.craigslist.com.ph/"); cityList.add("bacolod, Philippines");
        urlList.add("https://naga.craigslist.com.ph/"); cityList.add("bicol region, Philippines");
        urlList.add("https://cdo.craigslist.com.ph/"); cityList.add("cagayan de oro, Philippines");
        urlList.add("https://cebu.craigslist.com.ph/"); cityList.add("cebu, Philippines");
        urlList.add("https://davaocity.craigslist.com.ph/"); cityList.add("davao city, Philippines");
        urlList.add("https://iloilo.craigslist.com.ph/"); cityList.add("iloilo, Philippines");
        urlList.add("https://manila.craigslist.com.ph/"); cityList.add("manila, Philippines");
        urlList.add("https://pampanga.craigslist.com.ph/"); cityList.add("pampanga, Philippines");
        urlList.add("https://zamboanga.craigslist.com.ph/"); cityList.add("zamboanga, Philippines");
        urlList.add("http://singapore.craigslist.com.sg/"); cityList.add("singapore");
        urlList.add("http://taipei.craigslist.com.tw/"); cityList.add("taiwan");
        urlList.add("http://bangkok.craigslist.co.th/"); cityList.add("thailand");
        urlList.add("https://dubai.craigslist.org/"); cityList.add("united arab emirates");
        urlList.add("https://vietnam.craigslist.org/"); cityList.add("vietnam");
        urlList.add("https://adelaide.craigslist.com.au/"); cityList.add("adelaide, Australia");
        urlList.add("https://brisbane.craigslist.com.au/"); cityList.add("brisbane, Australia");
        urlList.add("https://cairns.craigslist.com.au/"); cityList.add("cairns, Australia");
        urlList.add("https://canberra.craigslist.com.au/"); cityList.add("canberra, Australia");
        urlList.add("https://darwin.craigslist.com.au/"); cityList.add("darwin, Australia");
        urlList.add("https://goldcoast.craigslist.com.au/"); cityList.add("gold coast, Australia");
        urlList.add("https://melbourne.craigslist.com.au/"); cityList.add("melbourne, Australia");
        urlList.add("https://ntl.craigslist.com.au/"); cityList.add("newcastle, NSW, Australia");
        urlList.add("https://perth.craigslist.com.au/"); cityList.add("perth, Australia");
        urlList.add("https://sydney.craigslist.com.au/"); cityList.add("sydney, Australia");
        urlList.add("https://hobart.craigslist.com.au/"); cityList.add("tasmania, Australia");
        urlList.add("https://wollongong.craigslist.com.au/"); cityList.add("wollongong, Australia");
        urlList.add("https://auckland.craigslist.org/"); cityList.add("auckland, New Zealand");
        urlList.add("https://christchurch.craigslist.org/"); cityList.add("christchurch, New Zealand");
        urlList.add("http://dunedin.craigslist.co.nz/"); cityList.add("dunedin, New Zealand");
        urlList.add("https://wellington.craigslist.org/"); cityList.add("wellington, New Zealand");
        urlList.add("https://buenosaires.craigslist.org/"); cityList.add("buenos aires, Argentina");
        urlList.add("https://lapaz.craigslist.org/"); cityList.add("bolivia");
        urlList.add("https://belohorizonte.craigslist.org/"); cityList.add("belo horizonte, Brazil");
        urlList.add("https://brasilia.craigslist.org/"); cityList.add("brasilia, Brazil");
        urlList.add("https://curitiba.craigslist.org/"); cityList.add("curitiba, Brazil");
        urlList.add("https://fortaleza.craigslist.org/"); cityList.add("fortaleza, Brazil");
        urlList.add("https://portoalegre.craigslist.org/"); cityList.add("porto alegre, Brazil");
        urlList.add("https://recife.craigslist.org/"); cityList.add("recife, Brazil");
        urlList.add("https://rio.craigslist.org/"); cityList.add("rio de janeiro, Brazil");
        urlList.add("https://salvador.craigslist.org/"); cityList.add("salvador, bahia, Brazil");
        urlList.add("https://saopaulo.craigslist.org/"); cityList.add("sao paulo, Brazil");
        urlList.add("https://caribbean.craigslist.org/"); cityList.add("caribbean islands");
        urlList.add("https://santiago.craigslist.org/"); cityList.add("chile");
        urlList.add("https://colombia.craigslist.org/"); cityList.add("colombia");
        urlList.add("https://costarica.craigslist.org/"); cityList.add("costa rica");
        urlList.add("https://santodomingo.craigslist.org/"); cityList.add("dominican republic");
        urlList.add("https://quito.craigslist.org/"); cityList.add("ecuador");
        urlList.add("https://elsalvador.craigslist.org/"); cityList.add("el salvador");
        urlList.add("https://guatemala.craigslist.org/"); cityList.add("guatemala");
        urlList.add("https://acapulco.craigslist.com.mx/"); cityList.add("acapulco, Mexico");
        urlList.add("https://bajasur.craigslist.com.mx/"); cityList.add("baja california sur, Mexico");
        urlList.add("https://chihuahua.craigslist.com.mx/"); cityList.add("chihuahua, Mexico");
        urlList.add("https://juarez.craigslist.com.mx/"); cityList.add("ciudad juarez, Mexico");
        urlList.add("https://guadalajara.craigslist.com.mx/"); cityList.add("guadalajara, Mexico");
        urlList.add("https://guanajuato.craigslist.com.mx/"); cityList.add("guanajuato, Mexico");
        urlList.add("https://hermosillo.craigslist.com.mx/"); cityList.add("hermosillo, Mexico");
        urlList.add("https://mazatlan.craigslist.com.mx/"); cityList.add("mazatlan, Mexico");
        urlList.add("https://mexicocity.craigslist.com.mx/"); cityList.add("mexico city, Mexico");
        urlList.add("https://monterrey.craigslist.com.mx/"); cityList.add("monterrey, Mexico");
        urlList.add("https://oaxaca.craigslist.com.mx/"); cityList.add("oaxaca, Mexico");
        urlList.add("https://puebla.craigslist.com.mx/"); cityList.add("puebla, Mexico");
        urlList.add("https://pv.craigslist.com.mx/"); cityList.add("puerto vallarta, Mexico");
        urlList.add("https://tijuana.craigslist.com.mx/"); cityList.add("tijuana, Mexico");
        urlList.add("https://veracruz.craigslist.com.mx/"); cityList.add("veracruz, Mexico");
        urlList.add("https://yucatan.craigslist.com.mx/"); cityList.add("yucatan, Mexico");
        urlList.add("https://managua.craigslist.org/"); cityList.add("nicaragua");
        urlList.add("https://panama.craigslist.org/"); cityList.add("panama");
        urlList.add("https://lima.craigslist.org/"); cityList.add("peru");
        urlList.add("https://puertorico.craigslist.org/"); cityList.add("puerto rico");
        urlList.add("https://montevideo.craigslist.org/"); cityList.add("montevideo, Uruguay");
        urlList.add("https://caracas.craigslist.org/"); cityList.add("venezuela");
        urlList.add("https://cairo.craigslist.org/"); cityList.add("egypt");
        urlList.add("https://addisababa.craigslist.org/"); cityList.add("ethiopia");
        urlList.add("https://accra.craigslist.org/"); cityList.add("ghana");
        urlList.add("https://kenya.craigslist.org/"); cityList.add("kenya");
        urlList.add("https://casablanca.craigslist.org/"); cityList.add("morocco");
        urlList.add("https://capetown.craigslist.co.za/"); cityList.add("cape town, South Africa");
        urlList.add("https://durban.craigslist.co.za/"); cityList.add("durban, South Africa");
        urlList.add("https://johannesburg.craigslist.co.za/"); cityList.add("johannesburg, South Africa");
        urlList.add("https://pretoria.craigslist.co.za/"); cityList.add("pretoria, South Africa");
        urlList.add("https://tunis.craigslist.org/"); cityList.add("tunisia");


        // Defining an adapter, to adapt my array list to the correct format.
        addaptedAray = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, cityList){

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view =super.getView(position, convertView, parent);

                TextView textView=(TextView) view.findViewById(android.R.id.text1);

            /*YOUR CHOICE OF COLOR*/
                textView.setTextColor(Color.CYAN);

                // Set the text color.
                switch (textColorChoice) {

                    case 0:

                        textView.setTextColor(ColorStateList.valueOf(Color.CYAN));

                        break;

                    case 1:
                        textView.setTextColor(ColorStateList.valueOf(Color.RED));
                        break;

                    case 2:
                        textView.setTextColor(ColorStateList.valueOf(Color.GREEN));
                        break;

                    case 3:
                        textView.setTextColor(ColorStateList.valueOf(Color.GRAY));
                        break;

                    case 4:
                        textView.setTextColor(ColorStateList.valueOf(Color.BLACK));
                        break;

                    case 5:
                        textView.setTextColor(ColorStateList.valueOf(Color.WHITE));
                        break;

                    case 6:
                        textView.setTextColor(ColorStateList.valueOf(Color.MAGENTA));
                        break;

                    case 7:
                        textView.setTextColor(ColorStateList.valueOf(Color.BLUE));
                        break;

                }

                return view;
            }
        };

        // Using the adapter to adapt my array list to the defined list view that I declared already.
        theList.setAdapter(addaptedAray);

        // Setting up a listener to "listen" for me to click on something in the list.
        theList.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            // Overriding the generic code that Android uses for list views to do something specific.
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int z, long l) {

                // Convert the int z into the strings we need.
                String a = (String) cityList.get(z);
                String b =  (String) urlList.get(z);

                // Logging that I tapped said item in the list.
                // Logging only, not needed. // Log.i("tapped", a);

                // Send my intent with my variables.
                Intent returnIntent = getIntent();
                returnIntent.putExtra("cityIntent",a);
                returnIntent.putExtra("urlIntent",b);
                setResult(Activity.RESULT_OK,returnIntent);
                finish();

            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);

        switch (fabColorChoice) {

            case 0:
                fab.setBackgroundTintList(ColorStateList.valueOf(Color.BLUE));
                break;

            case 1:
                fab.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
                break;

            case 2:
                fab.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                break;

            case 3:
                fab.setBackgroundTintList(ColorStateList.valueOf(Color.GRAY));
                break;

            case 4:
                fab.setBackgroundTintList(ColorStateList.valueOf(Color.BLACK));
                break;

            case 5:
                fab.setBackgroundTintList(ColorStateList.valueOf(Color.WHITE));
                break;

            case 6:
                fab.setBackgroundTintList(ColorStateList.valueOf(Color.MAGENTA));
                break;

            case 7:
                fab.setBackgroundTintList(ColorStateList.valueOf(Color.CYAN));
                break;

        }

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent returnIntent = getIntent();
                setResult(Activity.RESULT_CANCELED,returnIntent);
                finish();
            }
        });
    }

}
