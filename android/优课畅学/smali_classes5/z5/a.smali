.class public final synthetic Lz5/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/zykj/view/ui/crop/EzyCropActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/ui/crop/EzyCropActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz5/a;->a:Lcom/zykj/view/ui/crop/EzyCropActivity;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lz5/a;->a:Lcom/zykj/view/ui/crop/EzyCropActivity;

    invoke-static {v0, p1}, Lcom/zykj/view/ui/crop/EzyCropActivity;->n(Lcom/zykj/view/ui/crop/EzyCropActivity;Landroid/view/View;)V

    return-void
.end method
