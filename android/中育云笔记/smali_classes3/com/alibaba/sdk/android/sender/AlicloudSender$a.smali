.class Lcom/alibaba/sdk/android/sender/AlicloudSender$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/alibaba/sdk/android/sender/AlicloudSender;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:I

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/alibaba/sdk/android/sender/AlicloudSender$a;->a:I

    const-string v0, ""

    iput-object v0, p0, Lcom/alibaba/sdk/android/sender/AlicloudSender$a;->b:Ljava/lang/String;

    iput-object v0, p0, Lcom/alibaba/sdk/android/sender/AlicloudSender$a;->c:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/alibaba/sdk/android/sender/AlicloudSender$1;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/alibaba/sdk/android/sender/AlicloudSender$a;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/alibaba/sdk/android/sender/AlicloudSender$a;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/alibaba/sdk/android/sender/AlicloudSender$a;->a:I

    return p1
.end method

.method public static synthetic a(Lcom/alibaba/sdk/android/sender/AlicloudSender$a;)Ljava/lang/String;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/alibaba/sdk/android/sender/AlicloudSender$a;->b:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic a(Lcom/alibaba/sdk/android/sender/AlicloudSender$a;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/alibaba/sdk/android/sender/AlicloudSender$a;->b:Ljava/lang/String;

    return-object p1
.end method

.method public static synthetic b(Lcom/alibaba/sdk/android/sender/AlicloudSender$a;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/alibaba/sdk/android/sender/AlicloudSender$a;->c:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic b(Lcom/alibaba/sdk/android/sender/AlicloudSender$a;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/alibaba/sdk/android/sender/AlicloudSender$a;->c:Ljava/lang/String;

    return-object p1
.end method

.method public static synthetic c(Lcom/alibaba/sdk/android/sender/AlicloudSender$a;)I
    .locals 0

    iget p0, p0, Lcom/alibaba/sdk/android/sender/AlicloudSender$a;->a:I

    return p0
.end method
