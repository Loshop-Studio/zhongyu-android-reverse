.class public Lc9/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc9/c;->C(Lc9/c$b;)Lc9/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic c:Lc9/c$b;

.field public final synthetic d:Lc9/c;


# direct methods
.method public constructor <init>(Lc9/c;Lc9/c$b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc9/c$a;->d:Lc9/c;

    .line 2
    .line 3
    iput-object p2, p0, Lc9/c$a;->c:Lc9/c$b;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    .line 1
    iget-object p1, p0, Lc9/c$a;->c:Lc9/c$b;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object p2, p0, Lc9/c$a;->d:Lc9/c;

    .line 6
    .line 7
    invoke-virtual {p2}, Lc9/c;->A()La8/c;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    iget-object p4, p0, Lc9/c$a;->d:Lc9/c;

    .line 12
    .line 13
    invoke-virtual {p4}, Lc9/c;->A()La8/c;

    .line 14
    .line 15
    .line 16
    move-result-object p4

    .line 17
    invoke-virtual {p4, p3}, Lz7/b;->getItem(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p4

    .line 21
    check-cast p4, La8/a;

    .line 22
    .line 23
    invoke-interface {p1, p2, p4, p3}, Lc9/c$b;->a(La8/c;La8/a;I)V

    .line 24
    .line 25
    .line 26
    :cond_0
    iget-object p1, p0, Lc9/c$a;->d:Lc9/c;

    .line 27
    .line 28
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/popupwindow/popup/XUIBasePopup;->c()V

    .line 29
    .line 30
    .line 31
    return-void
.end method
