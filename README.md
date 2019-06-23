# SeekbarWithIndicator
Данный репозиторий содержит в себе код модифицированного seekbar с индикатором, который был создан в учебных целях для исследования языка Kotlin.
## Как это выглядит?
Было собрано небольшое тестовое приложение, где первый seekbar - стандартный от Google, а последние два - кастомные, задача группы seekbar менять фон родительского макета.

![animation](https://github.com/developer-kaczmarek/SeekbarWithIndicator/blob/master/animation.gif)

## Как это использовать?
Добавьте в своей проект SeekbarWithIndicator.kt в папку исходного кода и seekbar_attrs в папку value. Практически готово! Осталось добавить компонент в xml-разметку вот так:
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

