.class public Ly/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(Lk/a$a;Lk/c;Ljava/nio/ByteBuffer;I)Lk/a;
    .locals 1

    .line 1
    new-instance v0, Lk/e;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2, p3, p4}, Lk/e;-><init>(Lk/a$a;Lk/c;Ljava/nio/ByteBuffer;I)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
