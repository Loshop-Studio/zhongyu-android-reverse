# 问卷调查 业务代码导航

每个表格对应一个保留业务命名空间的包，方法来自 DEX 的类定义。点击类名可查看参与编译的实现。生成绑定、单字母类及第三方库另见完整包索引。

## com.zykj.message

| 类 | 方法摘录 |
|---|---|
| [KillSelfService](../../../android/问卷调查/smali/com/zykj/message/KillSelfService.smali) | `onBind`、`onStartCommand` |
| [UnInstallActivity](../../../android/问卷调查/smali/com/zykj/message/UnInstallActivity.smali) | `onBackPressed`、`onCreate`、`onResume` |
| [UnLoginActivity](../../../android/问卷调查/smali/com/zykj/message/UnLoginActivity.smali) | `onActivityResult`、`onBackPressed`、`onCreate`、`onDestroy`、`onPause`、`onRestart`、`onResume` |

## com.zykj.satisfaction

| 类 | 方法摘录 |
|---|---|
| [MainActivity](../../../android/问卷调查/smali/com/zykj/satisfaction/MainActivity.smali) | `onCreate`、`onRequestPermissionsResult`、`onResume` |
| [MyApplication](../../../android/问卷调查/smali/com/zykj/satisfaction/MyApplication.smali) | `onCreate`、`onTerminate` |

## com.zykj.satisfaction.update

| 类 | 方法摘录 |
|---|---|
| [PercentCircleView](../../../android/问卷调查/smali/com/zykj/satisfaction/update/PercentCircleView.smali) | `onDraw`、`onLayout`、`onMeasure`、`setTargetPercent` |
| [UpdateResp](../../../android/问卷调查/smali/com/zykj/satisfaction/update/UpdateResp.smali) | `getError`、`getResult`、`getSuccess`、`setError`、`setResult`、`setSuccess` |
