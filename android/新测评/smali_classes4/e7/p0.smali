.class public final synthetic Le7/p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Le7/o0;

.field public final synthetic b:Landroid/webkit/WebView;


# direct methods
.method public synthetic constructor <init>(Le7/o0;Landroid/webkit/WebView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le7/p0;->a:Le7/o0;

    iput-object p2, p0, Le7/p0;->b:Landroid/webkit/WebView;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Le7/p0;->a:Le7/o0;

    iget-object v1, p0, Le7/p0;->b:Landroid/webkit/WebView;

    invoke-static {v0, v1}, Le7/o0$b;->a(Le7/o0;Landroid/webkit/WebView;)V

    return-void
.end method
