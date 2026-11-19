.class public Lj9/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public b:Landroid/view/animation/Animation;

.field public c:Landroid/view/animation/Animation;

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:I

.field public i:I

.field public j:I

.field public k:I

.field public l:I

.field public m:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lj9/a;->a:Z

    .line 6
    .line 7
    const/high16 v0, 0x10a0000

    .line 8
    .line 9
    invoke-static {v0}, Lcom/xuexiang/xui/utils/f;->b(I)Landroid/view/animation/Animation;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lj9/a;->b:Landroid/view/animation/Animation;

    .line 14
    .line 15
    const v0, 0x10a0001

    .line 16
    .line 17
    .line 18
    invoke-static {v0}, Lcom/xuexiang/xui/utils/f;->b(I)Landroid/view/animation/Animation;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, Lj9/a;->c:Landroid/view/animation/Animation;

    .line 23
    .line 24
    sget v0, Lcom/xuexiang/xui/R$drawable;->stf_ic_empty:I

    .line 25
    .line 26
    iput v0, p0, Lj9/a;->d:I

    .line 27
    .line 28
    sget v0, Lcom/xuexiang/xui/R$string;->stfEmptyMessage:I

    .line 29
    .line 30
    iput v0, p0, Lj9/a;->e:I

    .line 31
    .line 32
    sget v0, Lcom/xuexiang/xui/R$drawable;->stf_ic_error:I

    .line 33
    .line 34
    iput v0, p0, Lj9/a;->f:I

    .line 35
    .line 36
    sget v0, Lcom/xuexiang/xui/R$string;->stfErrorMessage:I

    .line 37
    .line 38
    iput v0, p0, Lj9/a;->g:I

    .line 39
    .line 40
    sget v0, Lcom/xuexiang/xui/R$drawable;->stf_ic_offline:I

    .line 41
    .line 42
    iput v0, p0, Lj9/a;->h:I

    .line 43
    .line 44
    sget v0, Lcom/xuexiang/xui/R$string;->stfOfflineMessage:I

    .line 45
    .line 46
    iput v0, p0, Lj9/a;->i:I

    .line 47
    .line 48
    sget v0, Lcom/xuexiang/xui/R$drawable;->stf_ic_location_off:I

    .line 49
    .line 50
    iput v0, p0, Lj9/a;->j:I

    .line 51
    .line 52
    sget v0, Lcom/xuexiang/xui/R$string;->stfLocationOffMessage:I

    .line 53
    .line 54
    iput v0, p0, Lj9/a;->k:I

    .line 55
    .line 56
    sget v0, Lcom/xuexiang/xui/R$string;->stfRetryButtonText:I

    .line 57
    .line 58
    iput v0, p0, Lj9/a;->l:I

    .line 59
    .line 60
    sget v0, Lcom/xuexiang/xui/R$string;->stfLoadingMessage:I

    .line 61
    .line 62
    iput v0, p0, Lj9/a;->m:I

    .line 63
    .line 64
    return-void
.end method
