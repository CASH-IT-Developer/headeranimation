# headeranimation
![alt text](https://raw.githubusercontent.com/CASH-IT-Developer/headeranimation/master/Screenshot_1575959190.png)

# Header Animation

How to implementasi
   
   
   Add in build.gradle application
   
     allprojects {
          repositories {
             ...
             ...
             maven { url "https://jitpack.io" }

          }
      }
    
   Add in build.gradle module
    
    dependencies {
        ...
        ...
        implementation 'com.github.CASH-IT-Developer:headeranimation:1.0'
    }
    
   Set in layout.xml
      
     <com.cashit.HeaderAnimation
        android:id="@+id/waveHeader"
        android:layout_width="match_parent"
        android:layout_height="250dp"
        android:scaleY="1"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:animColorAlpha="0.25"
        app:animGradientAngle="90"
        app:animIsRunning="true"
        app:animProgress="1"
        app:animCloseColor="@color/colorPrimary" //set color gradient close here
        app:animStartColor="@color/colorPrimaryDark" //set color gradient start here
        app:animVelocity="10"
        app:animWaveHeight="10dp"
        app:animWaves="MultiWave">
    </com.cashit.HeaderAnimation>
    
