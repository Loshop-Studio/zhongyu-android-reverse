.class final Lcom/friday/common/helper/OssUploadHelper$ossUpload$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/common/helper/OssUploadHelper;->d(Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lxc/d;
    c = "com.friday.common.helper.OssUploadHelper"
    f = "OssUploadHelper.kt"
    l = {
        0xa0
    }
    m = "ossUpload"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:Lcom/friday/common/helper/OssUploadHelper;

.field public l:I


# direct methods
.method public constructor <init>(Lcom/friday/common/helper/OssUploadHelper;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/common/helper/OssUploadHelper$ossUpload$1;->k:Lcom/friday/common/helper/OssUploadHelper;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lvc/c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/friday/common/helper/OssUploadHelper$ossUpload$1;->j:Ljava/lang/Object;

    iget p1, p0, Lcom/friday/common/helper/OssUploadHelper$ossUpload$1;->l:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/friday/common/helper/OssUploadHelper$ossUpload$1;->l:I

    iget-object p1, p0, Lcom/friday/common/helper/OssUploadHelper$ossUpload$1;->k:Lcom/friday/common/helper/OssUploadHelper;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p0}, Lcom/friday/common/helper/OssUploadHelper;->a(Lcom/friday/common/helper/OssUploadHelper;Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
