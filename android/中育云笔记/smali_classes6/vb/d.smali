.class public final synthetic Lvb/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/activity/result/ActivityResultCallback;


# instance fields
.field public final synthetic a:Lvb/l;


# direct methods
.method public synthetic constructor <init>(Lvb/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvb/d;->a:Lvb/l;

    return-void
.end method


# virtual methods
.method public final onActivityResult(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lvb/d;->a:Lvb/l;

    check-cast p1, Landroid/net/Uri;

    invoke-static {v0, p1}, Lvb/l;->b(Lvb/l;Landroid/net/Uri;)V

    return-void
.end method
