.class public final Lr9/b$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr9/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr9/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# static fields
.field public static final a:Lr9/b$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lr9/b$c;

    .line 2
    .line 3
    invoke-direct {v0}, Lr9/b$c;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lr9/b$c;->a:Lr9/b$c;

    .line 7
    .line 8
    return-void
.end method

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
.method public a(La9/z;)La9/z;
    .locals 0

    .line 1
    return-object p1
.end method

.method public bridge synthetic convert(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La9/z;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lr9/b$c;->a(La9/z;)La9/z;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
