.class public final synthetic Le8/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Le8/j;

.field public final synthetic b:Lf8/a;


# direct methods
.method public synthetic constructor <init>(Le8/j;Lf8/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le8/g;->a:Le8/j;

    iput-object p2, p0, Le8/g;->b:Lf8/a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Le8/g;->a:Le8/j;

    iget-object v1, p0, Le8/g;->b:Lf8/a;

    invoke-static {v0, v1}, Le8/j;->f(Le8/j;Lf8/a;)V

    return-void
.end method
