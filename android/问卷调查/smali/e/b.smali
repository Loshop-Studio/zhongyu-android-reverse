.class public interface abstract Le/b;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Le/b;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Le/a;

    invoke-direct {v0}, Le/a;-><init>()V

    sput-object v0, Le/b;->a:Le/b;

    new-instance v0, Le/q/c/a;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Le/q/c/a;-><init>(Le/k;I)V

    return-void
.end method
