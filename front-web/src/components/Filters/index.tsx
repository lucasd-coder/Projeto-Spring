import React from 'react'
import { Link } from 'react-router-dom';

type Props = {
    link: string;
    linText: string;
}

const Filters = ({ link, linText }: Props) => (
    <div className="filters-container records-actions">
        <Link to={link}>
            <button className="action-filters">
                {linText}
            </button>
        </Link>
    </div>
);

export default Filters;