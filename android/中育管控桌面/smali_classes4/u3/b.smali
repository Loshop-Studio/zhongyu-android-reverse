.class public final synthetic Lu3/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Landroid/view/View$OnClickListener;

.field public final synthetic b:Landroidx/constraintlayout/widget/Group;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View$OnClickListener;Landroidx/constraintlayout/widget/Group;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu3/b;->a:Landroid/view/View$OnClickListener;

    iput-object p2, p0, Lu3/b;->b:Landroidx/constraintlayout/widget/Group;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lu3/b;->a:Landroid/view/View$OnClickListener;

    iget-object v1, p0, Lu3/b;->b:Landroidx/constraintlayout/widget/Group;

    invoke-static {v0, v1, p1}, Lcom/zykj/huiwei/launcher/ext/CommonExtKt;->a(Landroid/view/View$OnClickListener;Landroidx/constraintlayout/widget/Group;Landroid/view/View;)V

    return-void
.end method
