.class public Lcom/alibaba/sdk/android/crashdefend/CrashDefendApi;
.super Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static registerCrashDefendSdk(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;IILcom/alibaba/sdk/android/crashdefend/CrashDefendCallback;)V
    .locals 0

    invoke-static {p0}, Lcom/alibaba/sdk/android/crashdefend/a;->a(Landroid/content/Context;)Lcom/alibaba/sdk/android/crashdefend/a;

    move-result-object p0

    invoke-virtual/range {p0 .. p5}, Lcom/alibaba/sdk/android/crashdefend/a;->a(Ljava/lang/String;Ljava/lang/String;IILcom/alibaba/sdk/android/crashdefend/CrashDefendCallback;)Z

    return-void
.end method
