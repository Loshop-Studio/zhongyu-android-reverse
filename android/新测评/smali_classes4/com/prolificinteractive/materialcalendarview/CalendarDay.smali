.class public final Lcom/prolificinteractive/materialcalendarview/CalendarDay;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/prolificinteractive/materialcalendarview/CalendarDay;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public transient d:Ljava/util/Calendar;

.field public transient e:Ljava/util/Date;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/prolificinteractive/materialcalendarview/CalendarDay$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/prolificinteractive/materialcalendarview/CalendarDay$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(III)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->a:I

    .line 3
    iput p2, p0, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->b:I

    .line 4
    iput p3, p0, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->c:I

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 5
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    invoke-direct {p0, v0, v1, p1}, Lcom/prolificinteractive/materialcalendarview/CalendarDay;-><init>(III)V

    return-void
.end method

.method public static b(III)Lcom/prolificinteractive/materialcalendarview/CalendarDay;
    .locals 1

    .line 1
    new-instance v0, Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lcom/prolificinteractive/materialcalendarview/CalendarDay;-><init>(III)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static c(Ljava/util/Calendar;)Lcom/prolificinteractive/materialcalendarview/CalendarDay;
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    invoke-static {p0}, Lb2/e;->g(Ljava/util/Calendar;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-static {p0}, Lb2/e;->f(Ljava/util/Calendar;)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-static {p0}, Lb2/e;->b(Ljava/util/Calendar;)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    invoke-static {v0, v1, p0}, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->b(III)Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method public static d(Ljava/util/Date;)Lcom/prolificinteractive/materialcalendarview/CalendarDay;
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    invoke-static {p0}, Lb2/e;->e(Ljava/util/Date;)Ljava/util/Calendar;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {p0}, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->c(Ljava/util/Calendar;)Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public static l(III)I
    .locals 0

    .line 1
    mul-int/lit16 p0, p0, 0x2710

    mul-int/lit8 p1, p1, 0x64

    add-int/2addr p0, p1

    add-int/2addr p0, p2

    return p0
.end method

.method public static q()Lcom/prolificinteractive/materialcalendarview/CalendarDay;
    .locals 1

    .line 1
    invoke-static {}, Lb2/e;->d()Ljava/util/Calendar;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->c(Ljava/util/Calendar;)Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method


# virtual methods
.method public a(Ljava/util/Calendar;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/util/Calendar;->clear()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->a:I

    .line 5
    .line 6
    iget v1, p0, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->b:I

    .line 7
    .line 8
    iget v2, p0, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->c:I

    .line 9
    .line 10
    invoke-virtual {p1, v0, v1, v2}, Ljava/util/Calendar;->set(III)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public e()Ljava/util/Calendar;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->d:Ljava/util/Calendar;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lb2/e;->d()Ljava/util/Calendar;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->d:Ljava/util/Calendar;

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->a(Ljava/util/Calendar;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->d:Ljava/util/Calendar;

    .line 15
    .line 16
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_2

    .line 7
    .line 8
    const-class v2, Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    if-eq v2, v3, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    check-cast p1, Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 18
    .line 19
    iget v2, p0, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->c:I

    .line 20
    .line 21
    iget v3, p1, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->c:I

    .line 22
    .line 23
    if-ne v2, v3, :cond_2

    .line 24
    .line 25
    iget v2, p0, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->b:I

    .line 26
    .line 27
    iget v3, p1, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->b:I

    .line 28
    .line 29
    if-ne v2, v3, :cond_2

    .line 30
    .line 31
    iget v2, p0, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->a:I

    .line 32
    .line 33
    iget p1, p1, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->a:I

    .line 34
    .line 35
    if-ne v2, p1, :cond_2

    .line 36
    .line 37
    return v0

    .line 38
    :cond_2
    :goto_0
    return v1
.end method

.method public g()Ljava/util/Date;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->e:Ljava/util/Date;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->e()Ljava/util/Calendar;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->e:Ljava/util/Date;

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->e:Ljava/util/Date;

    .line 16
    .line 17
    return-object v0
.end method

.method public h()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->c:I

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget v0, p0, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->a:I

    .line 2
    .line 3
    iget v1, p0, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->b:I

    .line 4
    .line 5
    iget v2, p0, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->c:I

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->l(III)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public i()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public j()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->a:I

    .line 2
    .line 3
    return v0
.end method

.method public n(Lcom/prolificinteractive/materialcalendarview/CalendarDay;)Z
    .locals 4

    .line 1
    if-eqz p1, :cond_5

    .line 2
    .line 3
    iget v0, p0, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->a:I

    .line 4
    .line 5
    iget v1, p1, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->a:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    if-ne v0, v1, :cond_3

    .line 10
    .line 11
    iget v0, p0, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->b:I

    .line 12
    .line 13
    iget v1, p1, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->b:I

    .line 14
    .line 15
    if-ne v0, v1, :cond_1

    .line 16
    .line 17
    iget v0, p0, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->c:I

    .line 18
    .line 19
    iget p1, p1, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->c:I

    .line 20
    .line 21
    if-le v0, p1, :cond_0

    .line 22
    .line 23
    return v3

    .line 24
    :cond_0
    return v2

    .line 25
    :cond_1
    if-le v0, v1, :cond_2

    .line 26
    .line 27
    return v3

    .line 28
    :cond_2
    return v2

    .line 29
    :cond_3
    if-le v0, v1, :cond_4

    .line 30
    .line 31
    return v3

    .line 32
    :cond_4
    return v2

    .line 33
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 34
    .line 35
    const-string v0, "other cannot be null"

    .line 36
    .line 37
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw p1
.end method

.method public o(Lcom/prolificinteractive/materialcalendarview/CalendarDay;)Z
    .locals 4

    .line 1
    if-eqz p1, :cond_5

    .line 2
    .line 3
    iget v0, p0, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->a:I

    .line 4
    .line 5
    iget v1, p1, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->a:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    if-ne v0, v1, :cond_3

    .line 10
    .line 11
    iget v0, p0, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->b:I

    .line 12
    .line 13
    iget v1, p1, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->b:I

    .line 14
    .line 15
    if-ne v0, v1, :cond_1

    .line 16
    .line 17
    iget v0, p0, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->c:I

    .line 18
    .line 19
    iget p1, p1, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->c:I

    .line 20
    .line 21
    if-ge v0, p1, :cond_0

    .line 22
    .line 23
    return v3

    .line 24
    :cond_0
    return v2

    .line 25
    :cond_1
    if-ge v0, v1, :cond_2

    .line 26
    .line 27
    return v3

    .line 28
    :cond_2
    return v2

    .line 29
    :cond_3
    if-ge v0, v1, :cond_4

    .line 30
    .line 31
    return v3

    .line 32
    :cond_4
    return v2

    .line 33
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 34
    .line 35
    const-string v0, "other cannot be null"

    .line 36
    .line 37
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw p1
.end method

.method public p(Lcom/prolificinteractive/materialcalendarview/CalendarDay;Lcom/prolificinteractive/materialcalendarview/CalendarDay;)Z
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->n(Lcom/prolificinteractive/materialcalendarview/CalendarDay;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-nez p1, :cond_1

    .line 8
    .line 9
    :cond_0
    if-eqz p2, :cond_2

    .line 10
    .line 11
    invoke-virtual {p2, p0}, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->o(Lcom/prolificinteractive/materialcalendarview/CalendarDay;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-nez p1, :cond_1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    const/4 p1, 0x0

    .line 19
    return p1

    .line 20
    :cond_2
    :goto_0
    const/4 p1, 0x1

    .line 21
    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "CalendarDay{"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget v1, p0, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->a:I

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, "-"

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    iget v2, p0, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->b:I

    .line 22
    .line 23
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    iget v1, p0, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->c:I

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v1, "}"

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 1
    iget p2, p0, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->a:I

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 4
    .line 5
    .line 6
    iget p2, p0, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->b:I

    .line 7
    .line 8
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 9
    .line 10
    .line 11
    iget p2, p0, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->c:I

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
