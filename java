<?xml version="1.0" encoding="utf-8"?>

<FrameLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:animateLayoutChanges="true"
    tools:context=".MainActivity">


    <androidx.constraintlayout.widget.ConstraintLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content">

            android:layout_width="wrap_content"
            android:layout_height="wrap_content"


        <ImageView
            android:id="@+id/imageView2"
            android:layout_width="match_parent"
            android:layout_height="760dp"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:srcCompat="@drawable/agua"
            tools:layout_editor_absoluteY="-30dp" />

        <TimePicker
            android:id="@+id/time_picker"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:headerBackground="@color/colorPrimary"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintHorizontal_bias="0.0"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toTopOf="parent" />


        <EditText
            android:id="@+id/edit_text_number_interval"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginTop="92dp"
            android:ems="10"
            android:gravity="center_horizontal"
            android:hint="@string/hint"
            android:inputType="numberDecimal"
            android:maxEms="100"
            android:maxLength="3"
            android:textAlignment="center"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintHorizontal_bias="0.547"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toBottomOf="@+id/time_picker" />

        <Button
            android:id="@+id/bt_notify"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_marginStart="32dp"
            android:layout_marginLeft="32dp"
            android:layout_marginTop="76dp"
            android:layout_marginEnd="32dp"
            android:layout_marginRight="32dp"
            android:backgroundTint="@color/colorAccent"
            android:onClick="notifyClick"
            android:text="@string/notify"
            android:textColor="@color/white"
            android:textStyle="bold"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintHorizontal_bias="0.0"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toBottomOf="@+id/edit_text_number_interval" />


    </androidx.constraintlayout.widget.ConstraintLayout>


</FrameLayout>

