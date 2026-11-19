.class public abstract Lr/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Lr/g$d;


# direct methods
.method public constructor <init>(Lr/g$d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr/g$a;->a:Lr/g$d;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final d(Lr/r;)Lr/n;
    .locals 1

    .line 1
    new-instance p1, Lr/g;

    .line 2
    .line 3
    iget-object v0, p0, Lr/g$a;->a:Lr/g$d;

    .line 4
    .line 5
    invoke-direct {p1, v0}, Lr/g;-><init>(Lr/g$d;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method
