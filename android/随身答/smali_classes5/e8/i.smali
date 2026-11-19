.class public final synthetic Le8/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Le8/j;


# direct methods
.method public synthetic constructor <init>(Le8/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le8/i;->a:Le8/j;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Le8/i;->a:Le8/j;

    invoke-static {v0}, Le8/j;->d(Le8/j;)V

    return-void
.end method
