.class public final synthetic Le8/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf8/a;


# instance fields
.field public final synthetic a:Le8/j;


# direct methods
.method public synthetic constructor <init>(Le8/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le8/h;->a:Le8/j;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Le8/h;->a:Le8/j;

    check-cast p1, Ljava/lang/Class;

    invoke-static {v0, p1}, Le8/j;->e(Le8/j;Ljava/lang/Class;)V

    return-void
.end method
