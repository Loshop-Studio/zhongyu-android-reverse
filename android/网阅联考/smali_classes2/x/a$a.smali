.class public Lx/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Li/a$a;Li/c;Ljava/nio/ByteBuffer;I)Li/a;
    .locals 1

    .line 1
    new-instance v0, Li/e;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2, p3, p4}, Li/e;-><init>(Li/a$a;Li/c;Ljava/nio/ByteBuffer;I)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
