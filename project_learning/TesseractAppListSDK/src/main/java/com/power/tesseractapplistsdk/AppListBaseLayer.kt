package com.power.tesseractapplistsdk

import android.content.pm.PackageManager
import com.power.tesseractapplistsdk.impls.InstalledAppsImpl
import com.power.tesseractapplistsdk.services.InstalledAppsService

/**
 * Entry class for module
 */
object AppListBaseLayer {

    lateinit var mInstallAppService: InstalledAppsService

    /**
     * Initialize Package.
     */
    fun initModel(packageList: PackageManager) {
        mInstallAppService = InstalledAppsImpl()
        mInstallAppService.setPackageData(packageList)
    }

    /**
     * Request List of Packages.
     */
    fun getAppData() = mInstallAppService.getAppData()

}