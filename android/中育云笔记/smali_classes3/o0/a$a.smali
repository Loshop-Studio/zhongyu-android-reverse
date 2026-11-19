.class public Lo0/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln0/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo0/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Ln0/m;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ln0/m;

    .line 5
    .line 6
    const-wide/16 v1, 0x1f4

    .line 7
    .line 8
    invoke-direct {v0, v1, v2}, Ln0/m;-><init>(J)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lo0/a$a;->a:Ln0/m;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public c(Ln0/r;)Ln0/n;
    .locals 1

    .line 1
    new-instance p1, Lo0/a;

    .line 2
    .line 3
    iget-object v0, p0, Lo0/a$a;->a:Ln0/m;

    .line 4
    .line 5
    invoke-direct {p1, v0}, Lo0/a;-><init>(Ln0/m;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method
