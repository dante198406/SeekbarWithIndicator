# SeekbarWithIndicator
Данный репозиторий содержит в себе код модифицированного seekbar с индикатором, который был создан в учебных целях для исследования языка Kotlin.
## Как это выглядит?
Было собрано небольшое тестовое приложение, где первый seekbar - стандартный от Google, а последние два - кастомные, задача группы seekbar менять фон родительского макета.

![animation](https://github.com/developer-kaczmarek/SeekbarWithIndicator/blob/master/animation.gif)

## Как это использовать?
Добавьте в своей проект **SeekbarWithIndicator.kt**, **ic_indicator** в drawable (если хотите использовать изображение для индикатора по default), **seekbar_with_indicator.xml** в layout, **seekbar_attrs** в value. Практически готово! Осталось добавить компонент в xml-разметку вот так:
```
<androidx.constraintlayout.widget.ConstraintLayout
        xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity">
        
                <!your package name!.SeekbarWithIndicator
                      android:layout_width="0dp"
                      android:layout_height="wrap_content"
                      android:layout_marginStart="16dp"
                      android:layout_marginEnd="16dp"
                      android:progress="177"
                      android:max="255"
                      app:layout_constraintStart_toStartOf="parent"
                      app:layout_constraintTop_toTopOf="parent"
                      app:layout_constraintEnd_toEndOf="parent"
                      app:layout_constraintBottom_toBottomOf="parent"/>
                      
</androidx.constraintlayout.widget.ConstraintLayout>
```
## Что можно настроить?
Цвет текста на индикаторе, изображение индикатора, отступ индикатора от seekbar, стиль анимации show/hide индикатора, цвет полоски прогресса и Thumb, тогда xml-разметка будет выглядить приблизительно так: 
```
<androidx.constraintlayout.widget.ConstraintLayout
        xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity">
        
                <!your package name!.SeekbarWithIndicator
                      android:layout_width="0dp"
                      android:layout_height="wrap_content"
                      android:layout_marginStart="16dp"
                      android:layout_marginEnd="16dp"
                      android:progress="177"
                      android:max="255"
                      app:layout_constraintStart_toStartOf="parent"
                      app:layout_constraintTop_toTopOf="parent"
                      app:layout_constraintEnd_toEndOf="parent"
                      app:layout_constraintBottom_toBottomOf="parent"/>
                      android:progressTint="@color/colorBlue"
                      android:thumbTint="@color/colorBlue"
                      app:indicatorImageSource="@drawable/ic_bubble"
                      app:indicatorStyleAnimation="@style/IndicatorAnimation"
                      app:indicatorTextColor="@android:color/black"/>
                      
</androidx.constraintlayout.widget.ConstraintLayout>
```
## Баги / Вопросы /  Предложения
📧 [Напишите и я исправлю / отвечу / дополню как можно скорее](mailto:developer.kaczmarek@yandex.ru)
