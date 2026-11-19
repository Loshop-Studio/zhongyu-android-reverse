.class public final Le/q/g/i/j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Le/q/g/i/k;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le/q/g/i/j$a;
    }
.end annotation


# instance fields
.field public final a:Le/q/g/i/j$a;


# direct methods
.method public constructor <init>(Le/q/g/i/j$a;)V
    .locals 1

    const-string v0, "socketAdapterFactory"

    invoke-static {p1, v0}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/q/g/i/j;->a:Le/q/g/i/j$a;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
