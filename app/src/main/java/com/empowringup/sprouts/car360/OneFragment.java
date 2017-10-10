package com.empowringup.sprouts.car360;

        import android.content.Intent;
        import android.os.Bundle;
        import android.support.v4.app.Fragment;
        import android.support.v4.app.FragmentActivity;
        import android.util.Log;
        import android.view.KeyEvent;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.webkit.WebView;
        import android.webkit.WebViewClient;
        import android.webkit.WebViewFragment;


public class OneFragment extends android.support.v4.app.Fragment {


    String ulr;
    private WebView webView;

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        try {
            ulr = webView.getUrl();
        } catch (Exception e) {
            e.printStackTrace();
        }

        View v = inflater.inflate(R.layout.fragment_one, container, false);
            WebView website = (WebView) v.findViewById(R.id.website);
            website.getSettings().setJavaScriptEnabled(true);
            website.setWebViewClient(new SwAWebClient());
            website.loadUrl("http://car360official.blogspot.in/");
        return v;

    }

    private class SwAWebClient extends WebViewClient {

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return false;
        }

    }
        
}
