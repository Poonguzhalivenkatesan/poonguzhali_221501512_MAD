<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="16dp"
    android:background="@color/background">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/enter_roll_number"
        android:textSize="18sp"
        android:layout_marginBottom="8dp"/>

    <EditText
        android:id="@+id/rollno_input"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Roll Number"
        android:inputType="number"
        android:layout_marginBottom="16dp"/>

    <Button
        android:id="@+id/fetch_button"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="@string/fetch_student_details"/>

    <TextView
        android:id="@+id/student_info"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginTop="16dp"
        android:textSize="16sp"
        android:textColor="@color/textColor"/>

</LinearLayout>
