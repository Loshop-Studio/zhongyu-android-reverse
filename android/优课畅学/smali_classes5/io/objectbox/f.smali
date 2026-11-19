.class public final synthetic Lio/objectbox/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lio/objectbox/g;

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lq6/a;


# direct methods
.method public synthetic constructor <init>(Lio/objectbox/g;Ljava/lang/Object;Lq6/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/objectbox/f;->a:Lio/objectbox/g;

    iput-object p2, p0, Lio/objectbox/f;->b:Ljava/lang/Object;

    iput-object p3, p0, Lio/objectbox/f;->c:Lq6/a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lio/objectbox/f;->a:Lio/objectbox/g;

    iget-object v1, p0, Lio/objectbox/f;->b:Ljava/lang/Object;

    iget-object v2, p0, Lio/objectbox/f;->c:Lq6/a;

    invoke-static {v0, v1, v2}, Lio/objectbox/g;->d(Lio/objectbox/g;Ljava/lang/Object;Lq6/a;)V

    return-void
.end method
