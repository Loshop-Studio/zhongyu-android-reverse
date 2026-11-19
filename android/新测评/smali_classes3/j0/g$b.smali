.class public Lj0/g$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj0/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public a:[I

.field public b:I

.field public c:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x100

    .line 2
    new-array v0, v0, [I

    iput-object v0, p0, Lj0/g$b;->a:[I

    return-void
.end method

.method public synthetic constructor <init>(Lj0/g$a;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Lj0/g$b;-><init>()V

    return-void
.end method
