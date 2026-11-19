.class public Lcom/huawei/hms/core/aidl/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hms/core/aidl/e;


# instance fields
.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:I

.field public f:Ljava/lang/String;

.field public g:Ljava/util/List;

.field public h:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/huawei/hms/core/aidl/h;->c:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/huawei/hms/core/aidl/h;->d:Ljava/lang/String;

    .line 5
    iput p3, p0, Lcom/huawei/hms/core/aidl/h;->e:I

    .line 6
    iput-object p4, p0, Lcom/huawei/hms/core/aidl/h;->f:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/huawei/hms/core/aidl/h;->h:I

    .line 2
    .line 3
    return-void
.end method

.method public b(Ljava/util/List;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/huawei/hms/core/aidl/h;->g:Ljava/util/List;

    .line 2
    .line 3
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/huawei/hms/core/aidl/h;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/huawei/hms/core/aidl/h;->d:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public e(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/huawei/hms/core/aidl/h;->e:I

    .line 2
    .line 3
    return-void
.end method

.method public f(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/huawei/hms/core/aidl/h;->f:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method
