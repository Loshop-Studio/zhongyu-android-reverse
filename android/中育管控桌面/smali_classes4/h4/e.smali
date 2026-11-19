.class public final synthetic Lh4/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh4/e;->a:Landroid/content/Context;

    iput-object p2, p0, Lh4/e;->b:Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lh4/e;->a:Landroid/content/Context;

    iget-object v1, p0, Lh4/e;->b:Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;

    invoke-static {v0, v1}, Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;->a(Landroid/content/Context;Lcom/zykj/huiwei/launcher/ui/view/MenuItemView;)Lcom/zykj/huiwei/launcher/databinding/HwMenuItemViewBinding;

    move-result-object v0

    return-object v0
.end method
