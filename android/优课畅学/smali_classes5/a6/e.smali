.class public final synthetic La6/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/activity/result/ActivityResultCallback;


# instance fields
.field public final synthetic a:La6/l;


# direct methods
.method public synthetic constructor <init>(La6/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La6/e;->a:La6/l;

    return-void
.end method


# virtual methods
.method public final onActivityResult(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, La6/e;->a:La6/l;

    check-cast p1, Landroid/net/Uri;

    invoke-static {v0, p1}, La6/l;->f(La6/l;Landroid/net/Uri;)V

    return-void
.end method
