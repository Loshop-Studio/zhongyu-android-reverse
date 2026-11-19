.class public final synthetic Lcom/zykj/mistake/feature/notebook/detail/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Z

.field public final synthetic d:Lr6/a;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/String;Lr6/a;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/zykj/mistake/feature/notebook/detail/a0;->a:I

    iput-object p2, p0, Lcom/zykj/mistake/feature/notebook/detail/a0;->b:Ljava/lang/String;

    iput-boolean p4, p0, Lcom/zykj/mistake/feature/notebook/detail/a0;->c:Z

    iput-object p3, p0, Lcom/zykj/mistake/feature/notebook/detail/a0;->d:Lr6/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, Landroid/widget/ImageView;

    .line 2
    .line 3
    const-string v0, "imageView"

    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget v0, p0, Lcom/zykj/mistake/feature/notebook/detail/a0;->a:I

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/a0;->b:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 16
    .line 17
    .line 18
    iget-boolean v0, p0, Lcom/zykj/mistake/feature/notebook/detail/a0;->c:Z

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 21
    .line 22
    .line 23
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/a;

    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/detail/a0;->d:Lr6/a;

    .line 27
    .line 28
    invoke-direct {v0, v2, v1}, Lcom/zykj/mistake/feature/notebook/detail/a;-><init>(Lr6/a;I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 32
    .line 33
    .line 34
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 35
    .line 36
    return-object p1
.end method
