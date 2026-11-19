.class public Lq3/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static w:Lq3/c;


# instance fields
.field public a:Z

.field public b:I

.field public c:I

.field public d:Landroid/content/res/ColorStateList;

.field public e:Landroid/content/res/ColorStateList;

.field public f:Landroid/content/res/ColorStateList;

.field public g:I

.field public h:I

.field public i:Landroid/graphics/drawable/Drawable;

.field public j:I

.field public k:I

.field public l:Landroid/content/res/ColorStateList;

.field public m:I

.field public n:I

.field public o:I

.field public p:I

.field public q:I

.field public r:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

.field public s:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

.field public t:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

.field public u:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

.field public v:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lq3/c;->a:Z

    .line 6
    .line 7
    iput v0, p0, Lq3/c;->b:I

    .line 8
    .line 9
    iput v0, p0, Lq3/c;->c:I

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    iput-object v1, p0, Lq3/c;->d:Landroid/content/res/ColorStateList;

    .line 13
    .line 14
    iput-object v1, p0, Lq3/c;->e:Landroid/content/res/ColorStateList;

    .line 15
    .line 16
    iput-object v1, p0, Lq3/c;->f:Landroid/content/res/ColorStateList;

    .line 17
    .line 18
    iput v0, p0, Lq3/c;->g:I

    .line 19
    .line 20
    iput v0, p0, Lq3/c;->h:I

    .line 21
    .line 22
    iput-object v1, p0, Lq3/c;->i:Landroid/graphics/drawable/Drawable;

    .line 23
    .line 24
    iput v0, p0, Lq3/c;->j:I

    .line 25
    .line 26
    iput v0, p0, Lq3/c;->k:I

    .line 27
    .line 28
    iput-object v1, p0, Lq3/c;->l:Landroid/content/res/ColorStateList;

    .line 29
    .line 30
    iput v0, p0, Lq3/c;->m:I

    .line 31
    .line 32
    iput v0, p0, Lq3/c;->n:I

    .line 33
    .line 34
    iput v0, p0, Lq3/c;->o:I

    .line 35
    .line 36
    iput v0, p0, Lq3/c;->p:I

    .line 37
    .line 38
    iput v0, p0, Lq3/c;->q:I

    .line 39
    .line 40
    sget-object v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->a:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 41
    .line 42
    iput-object v0, p0, Lq3/c;->r:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 43
    .line 44
    iput-object v0, p0, Lq3/c;->s:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 45
    .line 46
    sget-object v1, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->c:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 47
    .line 48
    iput-object v1, p0, Lq3/c;->t:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 49
    .line 50
    iput-object v0, p0, Lq3/c;->u:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 51
    .line 52
    iput-object v0, p0, Lq3/c;->v:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 53
    .line 54
    return-void
.end method

.method public static a()Lq3/c;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0}, Lq3/c;->b(Z)Lq3/c;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    return-object v0
.end method

.method public static b(Z)Lq3/c;
    .locals 1

    .line 1
    sget-object v0, Lq3/c;->w:Lq3/c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    new-instance p0, Lq3/c;

    .line 8
    .line 9
    invoke-direct {p0}, Lq3/c;-><init>()V

    .line 10
    .line 11
    .line 12
    sput-object p0, Lq3/c;->w:Lq3/c;

    .line 13
    .line 14
    :cond_0
    sget-object p0, Lq3/c;->w:Lq3/c;

    .line 15
    .line 16
    return-object p0
.end method
