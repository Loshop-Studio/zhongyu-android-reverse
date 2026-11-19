.class public Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->r(Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic c:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$a;->c:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$a;->c:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->c(Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-lt p3, p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$a;->c:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;

    .line 10
    .line 11
    invoke-static {p1}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->e(Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;)Li9/b;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1}, Li9/b;->getCount()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-ge p3, p1, :cond_0

    .line 20
    .line 21
    add-int/lit8 p3, p3, 0x1

    .line 22
    .line 23
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$a;->c:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;

    .line 24
    .line 25
    invoke-static {p1, p3}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->d(Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;I)I

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$a;->c:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;

    .line 29
    .line 30
    const/4 p2, 0x0

    .line 31
    invoke-static {p1, p2}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->g(Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;Z)Z

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$a;->c:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;

    .line 35
    .line 36
    invoke-static {p1}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->e(Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;)Li9/b;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p1, p3}, Li9/b;->a(I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    iget-object p2, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$a;->c:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;

    .line 45
    .line 46
    invoke-static {p2}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->e(Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;)Li9/b;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    invoke-virtual {p2, p3}, Li9/b;->e(I)V

    .line 51
    .line 52
    .line 53
    iget-object p2, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$a;->c:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;

    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 60
    .line 61
    .line 62
    iget-object p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$a;->c:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;

    .line 63
    .line 64
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->o()V

    .line 65
    .line 66
    .line 67
    iget-object p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$a;->c:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;

    .line 68
    .line 69
    invoke-static {p1}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;->h(Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;)Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner$d;

    .line 70
    .line 71
    .line 72
    return-void
.end method
