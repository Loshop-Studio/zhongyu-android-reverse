.class public Lo0/m$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo0/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Lh0/b;

.field public final b:Ljava/util/List;

.field public final c:Li0/d;


# direct methods
.method public constructor <init>(Lh0/b;Li0/d;)V
    .locals 1

    .line 1
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-direct {p0, p1, v0, p2}, Lo0/m$a;-><init>(Lh0/b;Ljava/util/List;Li0/d;)V

    return-void
.end method

.method public constructor <init>(Lh0/b;Ljava/util/List;Li0/d;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, Le1/i;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lh0/b;

    iput-object p1, p0, Lo0/m$a;->a:Lh0/b;

    .line 4
    invoke-static {p2}, Le1/i;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    iput-object p1, p0, Lo0/m$a;->b:Ljava/util/List;

    .line 5
    invoke-static {p3}, Le1/i;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li0/d;

    iput-object p1, p0, Lo0/m$a;->c:Li0/d;

    return-void
.end method
