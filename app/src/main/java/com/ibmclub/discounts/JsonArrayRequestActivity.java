//package com.ibmclub.discounts;
//
//import android.os.Bundle;
//import android.support.annotation.Nullable;
//import android.support.v7.app.AppCompatActivity;
//import android.support.v7.widget.LinearLayoutManager;
//import android.support.v7.widget.RecyclerView;
//import android.view.View;
//import android.widget.Toast;
//
//import com.android.volley.DefaultRetryPolicy;
//import com.android.volley.Response;
//import com.android.volley.VolleyError;
//import com.android.volley.toolbox.JsonObjectRequest;
//import com.ibmclub.discounts.models.Posts;
//
//import org.json.JSONArray;
//import org.json.JSONException;
//import org.json.JSONObject;
//
//public class JsonArrayRequestActivity extends AppCompatActivity implements View.OnClickListener {
//
//	public static final String REQUEST_TAG = "JSON_ARRAY_REQUEST_TAG";
////	public static final String JSON_URL = "https://a8358567-593e-480f-a5ae-8b618156bf55-bluemix:5ccbddd77b7b701930b9ffa315496488c6f9df7c1afa89299cd8431d520d71e3@a8358567-593e-480f-a5ae-8b618156bf55-bluemix.cloudant.com/ibm-club/_design/categoriesView/_view/categories-view";
//public static final String JSON_URL = "https://a8358567-593e-480f-a5ae-8b618156bf55-bluemix.cloudant.com/ibm-club/_design/categoriesView/_view/categories-view";
//
//	@Override
//	protected void onCreate(@Nullable Bundle savedInstanceState) {
//		super.onCreate(savedInstanceState);
//
//		setContentView(R.layout.json_array_request_activity);
//
//		View view = findViewById(R.id.get_request);
//		if (view != null)
//			view.setOnClickListener(this);
//	}
//
//	private void sendRequest() {
//		JsonObjectRequest jsonArrayReq = new JsonObjectRequest(JSON_URL,
//				new Response.Listener<JSONObject>() {
//					@Override
//					public void onResponse(JSONObject response) {
//						JSONArray arrayFromResponse = new JSONArray();
//						try {
//							arrayFromResponse = response.getJSONArray("rows");
//						} catch (JSONException e) {
//							e.printStackTrace();
//						}
//						showResponse(new Posts(arrayFromResponse));
//					}
//				},
//				new Response.ErrorListener() {
//					@Override
//					public void onErrorResponse(VolleyError error) {
//						Toast.makeText(JsonArrayRequestActivity.this, error.getMessage(), Toast.LENGTH_LONG).show();
//					}
//				});
//
//		// Increase Timeout to 15 secs.
//		jsonArrayReq.setRetryPolicy(new DefaultRetryPolicy(15000,
//				DefaultRetryPolicy.DEFAULT_MAX_RETRIES,
//				DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
//
//		// Adding JsonObject request to request queue
//		AppController.getInstance().addToRequestQueue(jsonArrayReq, REQUEST_TAG);
//	}
//
//	private void showResponse(Posts posts) {
//		RecyclerView recyclerView = (RecyclerView) findViewById(R.id.request_response);
//		if (recyclerView != null) {
//			PostAdapter postAdapter = new PostAdapter(posts, R.layout.single_post);
//			recyclerView.setLayoutManager(new LinearLayoutManager(this));
//			recyclerView.setAdapter(postAdapter);
//		}
//	}
//
//	@Override
//	public void onClick(View v) {
//		switch (v.getId()) {
//			case R.id.get_request:
//				sendRequest();
//				break;
//		}
//	}
//
//	@Override
//	protected void onStop() {
//		super.onStop();
//		AppController.getInstance().getRequestQueue().cancelAll(REQUEST_TAG);
//	}
//}
