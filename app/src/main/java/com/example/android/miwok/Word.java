package com.example.android.miwok;

/**
 * Created by master on 24/01/17.
 */

public class Word {
    private static final int NO_IMAGE_PROVIDED = -1;
    // Image
    private int imageId = NO_IMAGE_PROVIDED;
    // English word
    private String mDefaultTraslation;
    // Miwok word
    private String mMiwokTraslation;
    // Miwok Audio
    private int mMiwokAudio;


    // Costruttore
    public Word (String english, String miwok, int audioId){
        mDefaultTraslation = english;
        mMiwokTraslation = miwok;
        mMiwokAudio = audioId;
    }

    // Costruttore
    public Word (String english, String miwok, int img, int audioId){
        mDefaultTraslation = english;
        mMiwokTraslation = miwok;
        imageId = img;
        mMiwokAudio = audioId;
    }

    //Get English Traslation
    public String getDefaultTraslation (){
        return mDefaultTraslation;
    }

    //Get miwok Traslation
    public String getMiwokTraslation (){
        return mMiwokTraslation;
    }

    //Get Id of the Image
    public int getImageId (){return imageId;}

    public boolean hasImage (){
        return imageId != NO_IMAGE_PROVIDED;
    }

    public int getmMiwokAudio () {
        return mMiwokAudio;
    }
}
