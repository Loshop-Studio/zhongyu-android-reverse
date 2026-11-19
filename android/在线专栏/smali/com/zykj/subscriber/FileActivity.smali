.class public final Lcom/zykj/subscriber/FileActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "SourceFile"

# interfaces
.implements Lc2/t$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/subscriber/FileActivity$a;
    }
.end annotation


# static fields
.field public static final e:Lcom/zykj/subscriber/FileActivity$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private b:I

.field private c:I

.field private d:Lc2/t;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/subscriber/FileActivity$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/subscriber/FileActivity$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lcom/zykj/subscriber/FileActivity;->e:Lcom/zykj/subscriber/FileActivity$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/zykj/subscriber/FileActivity;->a:Ljava/util/Map;

    return-void
.end method

.method public static synthetic d(Lcom/zykj/subscriber/FileActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/zykj/subscriber/FileActivity;->k(Lcom/zykj/subscriber/FileActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic e(Lcom/zykj/subscriber/FileActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/zykj/subscriber/FileActivity;->n(Lcom/zykj/subscriber/FileActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic f(Lcom/zykj/subscriber/FileActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/zykj/subscriber/FileActivity;->m(Lcom/zykj/subscriber/FileActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic g(Lcom/zykj/subscriber/FileActivity;Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/zykj/subscriber/FileActivity;->l(Lcom/zykj/subscriber/FileActivity;Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z

    move-result p0

    return p0
.end method

.method private final i(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/subscriber/FileActivity;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "this as java.lang.String).toLowerCase(Locale.ROOT)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const v2, 0x7f0900ff

    sparse-switch v1, :sswitch_data_0

    goto/16 :goto_1

    :sswitch_0
    const-string v1, "jpeg"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto/16 :goto_1

    :sswitch_1
    const-string v1, "png"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_1

    :sswitch_2
    const-string v1, "pdf"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_1

    .line 2
    :cond_1
    sget v0, Lc2/u;->i:I

    invoke-virtual {p0, v0}, Lcom/zykj/subscriber/FileActivity;->h(I)Landroid/view/View;

    move-result-object v0

    const-string v1, "pdfPage"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    .line 3
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 4
    sget-object v0, Lc2/t;->g:Lc2/t$a;

    invoke-virtual {v0, p1, p2}, Lc2/t$a;->a(Ljava/lang/String;Ljava/lang/String;)Lc2/t;

    move-result-object p1

    iput-object p1, p0, Lcom/zykj/subscriber/FileActivity;->d:Lc2/t;

    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->m()Landroidx/fragment/app/s;

    move-result-object p1

    .line 6
    iget-object p2, p0, Lcom/zykj/subscriber/FileActivity;->d:Lc2/t;

    invoke-static {p2}, Lkotlin/jvm/internal/l;->c(Ljava/lang/Object;)V

    .line 7
    invoke-virtual {p1, v2, p2}, Landroidx/fragment/app/s;->q(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/s;

    move-result-object p1

    .line 8
    invoke-virtual {p1}, Landroidx/fragment/app/s;->h()I

    goto :goto_2

    :sswitch_3
    const-string v1, "jpg"

    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_1

    :sswitch_4
    const-string v1, "gif"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_1

    :sswitch_5
    const-string v1, "bmp"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_1

    .line 10
    :cond_2
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->m()Landroidx/fragment/app/s;

    move-result-object v0

    .line 11
    sget-object v1, Lc2/e;->d:Lc2/e$a;

    invoke-virtual {v1, p1, p2}, Lc2/e$a;->a(Ljava/lang/String;Ljava/lang/String;)Lc2/e;

    move-result-object p1

    invoke-virtual {v0, v2, p1}, Landroidx/fragment/app/s;->q(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/s;

    move-result-object p1

    .line 12
    invoke-virtual {p1}, Landroidx/fragment/app/s;->h()I

    goto :goto_2

    .line 13
    :cond_3
    :goto_1
    sget-object p1, Ll2/h;->a:Ll2/h;

    const-string p2, "\u4e0d\u652f\u6301\u7684\u6587\u4ef6\u7c7b\u578b:"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->l(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p0, p2}, Ll2/h;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 14
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :goto_2
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x17d85 -> :sswitch_5
        0x18fc4 -> :sswitch_4
        0x19be1 -> :sswitch_3
        0x1b0f2 -> :sswitch_2
        0x1b229 -> :sswitch_1
        0x31e068 -> :sswitch_0
    .end sparse-switch
.end method

.method private final j(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const-string v1, ""

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    const/16 v3, 0x2e

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    move-object v2, p1

    .line 2
    invoke-static/range {v2 .. v7}, Le3/l;->Y(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result v0

    const/4 v2, -0x1

    if-gt v0, v2, :cond_1

    return-object v1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    const-string v0, "this as java.lang.String).substring(startIndex)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final k(Lcom/zykj/subscriber/FileActivity;Landroid/view/View;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method private static final l(Lcom/zykj/subscriber/FileActivity;Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 6

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x2

    if-ne p2, p1, :cond_6

    .line 1
    sget p1, Lc2/u;->i:I

    invoke-virtual {p0, p1}, Lcom/zykj/subscriber/FileActivity;->h(I)Landroid/view/View;

    move-result-object p2

    sget p3, Lc2/u;->a:I

    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroidx/appcompat/widget/AppCompatEditText;

    invoke-virtual {p2}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/subscriber/FileActivity;->h(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/AppCompatEditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->length()I

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    invoke-static {p2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    const-wide/32 v4, 0x7fffffff

    cmp-long v0, v2, v4

    if-lez v0, :cond_1

    const p2, 0x7fffffff

    goto :goto_0

    :cond_1
    invoke-static {p2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p2

    :goto_0
    if-nez p2, :cond_2

    const/4 p2, 0x1

    goto :goto_1

    .line 3
    :cond_2
    iget v0, p0, Lcom/zykj/subscriber/FileActivity;->c:I

    if-le p2, v0, :cond_3

    move p2, v0

    :cond_3
    :goto_1
    iput p2, p0, Lcom/zykj/subscriber/FileActivity;->b:I

    if-ge p2, v1, :cond_4

    .line 4
    iput v1, p0, Lcom/zykj/subscriber/FileActivity;->b:I

    .line 5
    :cond_4
    iget-object p2, p0, Lcom/zykj/subscriber/FileActivity;->d:Lc2/t;

    if-nez p2, :cond_5

    goto :goto_2

    :cond_5
    iget v0, p0, Lcom/zykj/subscriber/FileActivity;->b:I

    sub-int/2addr v0, v1

    invoke-virtual {p2, v0}, Lc2/t;->u(I)V

    .line 6
    :goto_2
    invoke-virtual {p0, p1}, Lcom/zykj/subscriber/FileActivity;->h(I)Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroidx/appcompat/widget/AppCompatEditText;

    invoke-virtual {p2}, Landroid/widget/EditText;->clearFocus()V

    .line 7
    invoke-virtual {p0, p1}, Lcom/zykj/subscriber/FileActivity;->h(I)Landroid/view/View;

    move-result-object p0

    invoke-virtual {p0, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/appcompat/widget/AppCompatEditText;

    invoke-static {p0}, Lcom/xuexiang/xui/utils/KeyboardUtils;->hideSoftInput(Landroid/view/View;)V

    :cond_6
    const/4 p0, 0x0

    return p0
.end method

.method private static final m(Lcom/zykj/subscriber/FileActivity;Landroid/view/View;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget p1, p0, Lcom/zykj/subscriber/FileActivity;->b:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lcom/zykj/subscriber/FileActivity;->b:I

    .line 2
    iget-object p0, p0, Lcom/zykj/subscriber/FileActivity;->d:Lc2/t;

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    add-int/lit8 p1, p1, -0x1

    invoke-virtual {p0, p1}, Lc2/t;->u(I)V

    :goto_0
    return-void
.end method

.method private static final n(Lcom/zykj/subscriber/FileActivity;Landroid/view/View;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget p1, p0, Lcom/zykj/subscriber/FileActivity;->b:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/zykj/subscriber/FileActivity;->b:I

    .line 2
    iget-object p0, p0, Lcom/zykj/subscriber/FileActivity;->d:Lc2/t;

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    add-int/lit8 p1, p1, -0x1

    invoke-virtual {p0, p1}, Lc2/t;->u(I)V

    :goto_0
    return-void
.end method


# virtual methods
.method public b(II)V
    .locals 5

    .line 1
    sget v0, Lc2/u;->i:I

    invoke-virtual {p0, v0}, Lcom/zykj/subscriber/FileActivity;->h(I)Landroid/view/View;

    move-result-object v1

    sget v2, Lc2/u;->a:I

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroidx/appcompat/widget/AppCompatEditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->clearFocus()V

    .line 2
    iput p1, p0, Lcom/zykj/subscriber/FileActivity;->b:I

    .line 3
    iput p2, p0, Lcom/zykj/subscriber/FileActivity;->c:I

    .line 4
    invoke-virtual {p0, v0}, Lcom/zykj/subscriber/FileActivity;->h(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroidx/appcompat/widget/AppCompatEditText;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 5
    invoke-virtual {p0, v0}, Lcom/zykj/subscriber/FileActivity;->h(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroidx/appcompat/widget/AppCompatEditText;

    invoke-virtual {p0, v0}, Lcom/zykj/subscriber/FileActivity;->h(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroidx/appcompat/widget/AppCompatEditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->length()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/EditText;->setSelection(I)V

    .line 6
    invoke-virtual {p0, v0}, Lcom/zykj/subscriber/FileActivity;->h(I)Landroid/view/View;

    move-result-object v1

    sget v2, Lc2/u;->l:I

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-lez p2, :cond_2

    .line 7
    invoke-virtual {p0, v0}, Lcom/zykj/subscriber/FileActivity;->h(I)Landroid/view/View;

    move-result-object v1

    sget v2, Lc2/u;->e:I

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroidx/appcompat/widget/AppCompatImageView;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-le p1, v3, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    invoke-virtual {v1, v4}, Landroid/widget/ImageView;->setEnabled(Z)V

    .line 8
    invoke-virtual {p0, v0}, Lcom/zykj/subscriber/FileActivity;->h(I)Landroid/view/View;

    move-result-object v0

    sget v1, Lc2/u;->d:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/AppCompatImageView;

    if-ge p1, p2, :cond_1

    const/4 v2, 0x1

    :cond_1
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setEnabled(Z)V

    :cond_2
    return-void
.end method

.method public h(I)Landroid/view/View;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/zykj/subscriber/FileActivity;->a:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    if-nez v1, :cond_1

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    :goto_0
    return-object v1
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 6
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    # RE layout layout/activity_file (0x7f0c001c), APK res/1r.xml
    const p1, 0x7f0c001c

    .line 2
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(I)V

    .line 3
    sget p1, Lc2/u;->k:I

    invoke-virtual {p0, p1}, Lcom/zykj/subscriber/FileActivity;->h(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/zykj/subscriber/view/CommonTitleBar;

    new-instance v0, Lc2/a;

    invoke-direct {v0, p0}, Lc2/a;-><init>(Lcom/zykj/subscriber/FileActivity;)V

    invoke-virtual {p1, v0}, Lcom/zykj/subscriber/view/CommonTitleBar;->h(Landroid/view/View$OnClickListener;)Lcom/zykj/subscriber/view/CommonTitleBar;

    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "file_path"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result p1

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 5
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v1

    .line 6
    :goto_0
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v2, "url_path"

    invoke-virtual {v0, v2}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 7
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :cond_1
    const/4 v0, 0x1

    const/4 v2, 0x0

    if-eqz p1, :cond_3

    .line 8
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-nez v3, :cond_2

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    goto :goto_2

    :cond_3
    :goto_1
    const/4 v3, 0x1

    :goto_2
    if-eqz v3, :cond_4

    .line 9
    sget-object p1, Ll2/h;->a:Ll2/h;

    const-string v0, "\u6587\u4ef6\u4e0d\u5b58\u5728"

    invoke-virtual {p1, p0, v0}, Ll2/h;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 10
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    :cond_4
    if-eqz v1, :cond_6

    .line 11
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-nez v3, :cond_5

    goto :goto_3

    :cond_5
    const/4 v0, 0x0

    :cond_6
    :goto_3
    if-eqz v0, :cond_7

    .line 12
    sget-object p1, Ll2/h;->a:Ll2/h;

    const-string v0, "\u6587\u4ef6\u7f51\u7edc\u5730\u5740\u4e0d\u5b58\u5728"

    invoke-virtual {p1, p0, v0}, Ll2/h;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 13
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    .line 14
    :cond_7
    sget v0, Lc2/u;->c:I

    invoke-virtual {p0, v0}, Lcom/zykj/subscriber/FileActivity;->h(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 15
    sget v0, Lc2/u;->i:I

    invoke-virtual {p0, v0}, Lcom/zykj/subscriber/FileActivity;->h(I)Landroid/view/View;

    move-result-object v3

    sget v4, Lc2/u;->a:I

    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroidx/appcompat/widget/AppCompatEditText;

    new-instance v5, Lc2/d;

    invoke-direct {v5, p0}, Lc2/d;-><init>(Lcom/zykj/subscriber/FileActivity;)V

    invoke-virtual {v3, v5}, Landroid/widget/EditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 16
    invoke-virtual {p0, v0}, Lcom/zykj/subscriber/FileActivity;->h(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroidx/appcompat/widget/AppCompatEditText;

    invoke-virtual {v3}, Landroid/widget/EditText;->clearFocus()V

    .line 17
    invoke-virtual {p0, v0}, Lcom/zykj/subscriber/FileActivity;->h(I)Landroid/view/View;

    move-result-object v3

    sget v4, Lc2/u;->e:I

    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroidx/appcompat/widget/AppCompatImageView;

    invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setEnabled(Z)V

    .line 18
    invoke-virtual {p0, v0}, Lcom/zykj/subscriber/FileActivity;->h(I)Landroid/view/View;

    move-result-object v3

    sget v5, Lc2/u;->d:I

    invoke-virtual {v3, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroidx/appcompat/widget/AppCompatImageView;

    invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setEnabled(Z)V

    .line 19
    invoke-virtual {p0, v0}, Lcom/zykj/subscriber/FileActivity;->h(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroidx/appcompat/widget/AppCompatImageView;

    new-instance v3, Lc2/c;

    invoke-direct {v3, p0}, Lc2/c;-><init>(Lcom/zykj/subscriber/FileActivity;)V

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 20
    invoke-virtual {p0, v0}, Lcom/zykj/subscriber/FileActivity;->h(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/AppCompatImageView;

    new-instance v2, Lc2/b;

    invoke-direct {v2, p0}, Lc2/b;-><init>(Lcom/zykj/subscriber/FileActivity;)V

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 21
    invoke-direct {p0, p1, v1}, Lcom/zykj/subscriber/FileActivity;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
