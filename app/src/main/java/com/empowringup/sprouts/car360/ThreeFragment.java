package com.empowringup.sprouts.car360;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class ThreeFragment extends android.support.v4.app.Fragment {

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_three, container, false);
        WebView fb = (WebView) v.findViewById(R.id.fb);
        fb.getSettings().setJavaScriptEnabled(true);
        fb.setWebViewClient(new SwAWebClient());
        fb.loadUrl("https://www.facebook.com/car360official/");
        return v;
    }

    private class SwAWebClient extends WebViewClient {

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return false;
        }
    }
}
