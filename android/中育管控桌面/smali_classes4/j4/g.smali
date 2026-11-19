.class public final synthetic Lj4/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lj4/k;

.field public final synthetic b:Landroid/widget/Button;


# direct methods
.method public synthetic constructor <init>(Lj4/k;Landroid/widget/Button;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj4/g;->a:Lj4/k;

    iput-object p2, p0, Lj4/g;->b:Landroid/widget/Button;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lj4/g;->a:Lj4/k;

    iget-object v1, p0, Lj4/g;->b:Landroid/widget/Button;

    invoke-static {v0, v1, p1}, Lj4/k;->a(Lj4/k;Landroid/widget/Button;Landroid/view/View;)V

    return-void
.end method
