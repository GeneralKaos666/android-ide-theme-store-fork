package moe.smoothie.androidide.themestore.viewmodels

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope

import dagger.assisted.Assisted
import dagger.assisted.AssistedFactory
import dagger.assisted.AssistedInject
import dagger.hilt.android.lifecycle.HiltViewModel

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

import okhttp3.OkHttpClient

import moe.smoothie.androidide.themestore.ThemeState

@HiltViewModel(assistedFactory = ThemeActivityViewModel.ThemeActivityViewModelFactory::class)
class ThemeActivityViewModel @AssistedInject constructor(
    private val httpClient: OkHttpClient,
    @Assisted private val url: String
) : ViewModel() {
    private val _isLoading = MutableStateFlow(false)
    val isLoading: StateFlow<Boolean> = _isLoading

    private val _themeState = MutableStateFlow<ThemeState?>(null)
    val themeState: StateFlow<ThemeState?> = _themeState

    fun loadInfo() {

    }
    
    @AssistedFactory
    interface ThemeActivityViewModelFactory {
        fun create(url: String) : ThemeActivityViewModel
    }
}

/*
@AssistedFactory
interface ThemeActivityViewModelFactory {
    fun create(url: String)
}

@HiltViewModel
class ThemeActivityViewModel @Inject constructor(
    private val httpClient: OkHttpClient,
    @Assisted private val url: String
) : ViewModel() {
    
    private val _isLoading = MutableStateFlow(false)
    val isLoading: StateFlow<Boolean> = _isLoading

    private val _themeState = MutableStateFlow<ThemeState?>(null)
    val themeState: StateFlow<ThemeState?> = _themeState

    fun loadInfo() {

    }
}
*/