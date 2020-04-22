<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="pageTitle" value="All Films List"/>

<%@include file="common/header.jspf"%>

<c:url value="/filmList" var="/filmListUrl"/> <!--has to match in controller @Requestmapping-->
<form method="POST" action="${filmListUrl}">

        <label for="minLength">Minimun Length:</label> <!--this lastName is looking for input with an id of lastName-->
        <input type="text" name="minLength" id="minLength"/> <!--if want to make required need to add next to id-->
        <label for="maxLength">Maximun Length:</label>
        <input type="text" name="maxLength" id="maxLength"/>

    <div class="formInputGenre">
        <label for="genre">Genre:</label>
        <select name="genre"	id="genre"/>

            <option value="Action">Action</option>
            <option value="Animation">Animation</option>
            <option value="Children">Children</option>
            <option value="Classics">Classics</option>
            <option value="Comedy">Comedy</option>
            <option value="Documentary">Documentary</option>
            <option value="Drama">Drama</option>
            <option value="Family">Family</option>
            <option value="Foreign">Foreign</option>
            <option value="Games">Games</option>
            <option value="Horror">Horror</option>
            <option value="Music">Music</option>
            <option value="New">New</option>
            <option value="Sci-Fi">Sci-Fi</option>
            <option value="Sports">Sports</option>
            <option value="Travel">Travel</option>

        </select>
    </div>

        <input type="submit" name="submit" value="search"/>

</form>


<table class="table">
    <tr>

        <th>Title</th>
        <th>Description</th>
        <th>Release Year</th>
        <th>Length</th>
        <th>Rating</th>

    </tr>

    <c:forEach items="${films}" var="film">
        <tr>
            <td>${film.title} </td>
            <td>${film.description}</td>
            <td>${film.releaseYear}</td>
            <td>${film.length}</td>
            <td>${film.rating}</td>

            <!-- What do we print here for each actor? -->
        </tr>
    </c:forEach>
</table>


<%@include file="common/footer.jspf"%>