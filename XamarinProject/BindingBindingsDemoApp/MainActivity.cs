using Android.App;
using Android.Content;
using Android.OS;
using Android.Widget;

namespace BindingBindingsDemoApp
{
    [Activity(Label = "BindingBindingsDemoApp", MainLauncher = true, Icon = "@mipmap/icon")]
    public class MainActivity : Activity
    {
        protected override void OnCreate(Bundle savedInstanceState)
        {
            base.OnCreate(savedInstanceState);

            // Set our view from the "main" layout resource
            SetContentView(Resource.Layout.Main);

            // Get our button from the layout resource,
            // and attach an event to it
            Button button = FindViewById<Button>(Resource.Id.myButton);

            button.Click += delegate {
                var intent = new Intent(this, typeof(Databinding.Android.Librarywithbinding.BindingSampleActivity));
                StartActivity(intent);
            };
        }
    }
}

