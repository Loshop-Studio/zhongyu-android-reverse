.class public final synthetic Lv3/m1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/activity/result/ActivityResultCallback;


# instance fields
.field public final synthetic a:Lcom/friday/main/view/HomeActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/main/view/HomeActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv3/m1;->a:Lcom/friday/main/view/HomeActivity;

    return-void
.end method


# virtual methods
.method public final onActivityResult(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lv3/m1;->a:Lcom/friday/main/view/HomeActivity;

    check-cast p1, Landroidx/activity/result/ActivityResult;

    invoke-static {v0, p1}, Lcom/friday/main/view/HomeActivity;->b0(Lcom/friday/main/view/HomeActivity;Landroidx/activity/result/ActivityResult;)V

    return-void
.end method
